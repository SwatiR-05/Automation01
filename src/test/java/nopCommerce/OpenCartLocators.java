package nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launching the browser
		WebDriver driver = new ChromeDriver();
		
		//launching the url
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		
		//Locators
		//id
		Thread.sleep(3000);
	WebElement search=	driver.findElement(By.name("//input[@name=\"search\"]"));
	Thread.sleep(3000);
	search.sendKeys("T-shirts");
		
		

	}

}
