package PracticeSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
	List<WebElement> allImages=	driver.findElements(By.tagName("img"));
		System.out.println("Total num of images: " + allImages.size());
	
for(WebElement e:allImages) {
	String imgAlt= e.getAttribute("alt");
	String imgSrc= e.getAttribute("src");
	System.out.println(imgAlt + "--"+ imgSrc);
}
	
}
}
