package PracticeSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://html.com/attributes/select-multiple/");
		
		//we for the specific dropdown

		WebElement dropDownEle = driver.findElement(By.xpath("//select[@multiple]"));
		
		//pass in select object

		Select selectD = new Select(dropDownEle);

		//select if multiple
		System.out.println(selectD.isMultiple());

		if (selectD.isMultiple()) {
			System.out.println("Multi select dropdown is present");

			selectD.selectByIndex(0);
			selectD.selectByValue("Chilean");
			selectD.selectByVisibleText("Andean flamingo");

		}
		
		//deselect
	
		selectD.deselectAll();

	}
}
