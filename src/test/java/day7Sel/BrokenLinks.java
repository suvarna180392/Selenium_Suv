package day7Sel;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {


		ChromeOptions options = new ChromeOptions();
		
		options.setBrowserVersion("125.0.6422.113");
		
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		int countOfLinks = 0;
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement i : links) {
			
		String hrefLink = i.getAttribute("href");
		
		System.out.println(hrefLink);
			
		if(hrefLink==null ||hrefLink.isEmpty() || hrefLink.startsWith("javascript:")) {
			
			
			continue;
			
			
		}
		
		
			URL url = new URL(hrefLink);
			
			HttpURLConnection htc = (HttpURLConnection)url.openConnection();
			
			htc.connect(); 
			
			if(htc.getResponseCode() > 400) {
				
				System.out.println("This is a broken link : "+hrefLink);
				
				countOfLinks++;
				}
			
			else {
				
				System.out.println("This is not a broken link: "+hrefLink);
			}
			
			
			
		
			
		}
		
		
		System.out.println("No. of broken links on the page: "+countOfLinks);
		
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
