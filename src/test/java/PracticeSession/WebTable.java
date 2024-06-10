package PracticeSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> Links =  driver.findElements(By.xpath(null));
		//System.out.println(Links.size());
		String Name="Stanrose Mafatla";
		for(int i=0;i<Links.size();i++)
		{
		//	if(Links.get(i).getText().equalsIgnoreCase(name))
			{
				Links.get(i).click();
				break;
			}
		}
		System.out.println("Clicked");
	}



}
