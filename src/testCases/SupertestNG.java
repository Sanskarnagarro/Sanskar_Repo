package testCases;

import java.net.MalformedURLException;

import org.apache.log4j.Category;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SupertestNG {
	
	
	WebDriver driver;
	String driverPath = "C:\\chromedriver.exe";
	@BeforeClass
	public void setup() throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		Category logger = null;
		
		 String baseUrl = "https://www.flipkart.com/";
		  
			 System.out.println("Launching Google Chrome browser"); 
		        driver = new ChromeDriver();
		        driver.get(baseUrl);
			 
		 
	        
		}
	
	@AfterClass
	public void afterMethod() {
		
		driver.close();
		
		System.out.println("Finished Test On Chrome Browser");
	} 

}
