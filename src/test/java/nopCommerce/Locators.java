package nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nopcommerce.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(3000);
		driver.findElement(By.linkText("black-border-button")).click();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.google.com");
		
		
		
	}

}
