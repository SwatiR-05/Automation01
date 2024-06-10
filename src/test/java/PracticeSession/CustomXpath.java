package PracticeSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//X-Path Axes
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//clickUser("Kevin.Mathews");
		
	WebElement tick=	driver.findElement(By.xpath("//a[text()= 'Jasmine.Morgan']/ancestor::tr/td/input"));
		
		tick.click();
	}
		
//		public static void clickUser (String userName) {
//		String path="//a[text()= '"+userName+"']/ancestor::tr/td/input')";
//			driver.findElement(By.xpath(Path)).click();
//		}
//		
//public static List<String> getDetails(String userName) {
	List<String> alldetails= new ArrayList<String>();
List <WebElement> userDetails=	driver.findElements(By.xpath("//a[text()='Jasmine.Morgan']/parent::td//following-sibling::td"));{


	for (WebElement e:userDetails) {
		String txt=e.getText();
		alldetails.add(txt);
	}
	System.out.println(alldetails);
}
	
	}


