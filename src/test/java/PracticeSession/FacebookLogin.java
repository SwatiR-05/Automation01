package PracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		//page url
		String PageUrl= driver.getCurrentUrl();
		System.out.println(PageUrl);
		
		//page title
		String PageTitle= driver.getTitle();
		System.out.println(PageTitle);
		
		//verifying title
		if(PageTitle.contains("Facebook")) {
			System.out.println("Correct page");
		}else {
			System.out.println("Incorrect page");
		}
		
		driver.navigate().back();
		driver.navigate().forward();
		
		//Creating WebElement
		
		
		
				
		

	}

}
