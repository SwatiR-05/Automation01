package PracticeSession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggGroww {

	public static void main(String[] args) {
		// Grow App
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id=\"globalSearch23\"]")).sendKeys("HDFC Bank");
	
		List<WebElement> GrowSugg= driver.findElements(By.xpath("//div[@id=\"globalSearch23-suggestionsContainer\"]//div[@class=\"gsc23SuggestionText\"]/div/span[3]"));

		System.out.println(GrowSugg.size());
		for(WebElement e:GrowSugg ) {
			String txt=e.getText();
			System.out.println(txt);
			
		}
	
	}

}
