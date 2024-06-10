package PracticeSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalLinks {

public static	ArrayList<String> listOfAttributes = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total num of links: " + allLinks.size());

		for (int i = 0; i < allLinks.size(); i++) {
			String linkText = allLinks.get(i).getText();
			if (linkText.length() != 0) {
				System.out.println(linkText);
			}
		}
System.out.println("- - - - - ");
		// TextField
		List<WebElement> inputFields = driver.findElements(By.tagName("input"));
		System.out.println("Total num of input fileds = " + inputFields.size());
		for (WebElement e : inputFields) {
			String attrValue = e.getAttribute("placeholder");
			String name = e.getAttribute("name");
			if (attrValue.length() != 0 & name.length()!=0) {
				System.out.println(attrValue +"--"+ name);
				//listOfAttributes.add(attrValue);
				
			}
			//System.out.println(listOfAttributes);

		}

	}
}
