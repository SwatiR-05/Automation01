package PracticeSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		WebElement dropDown=driver.findElement(By.xpath("//input[@id='justAnInputBox1']"));
		dropDown.click();
		List<WebElement> options= driver.findElements(By.xpath("//span[@class=\"comboTreeItemTitle\"]"));
//Single select
		System.out.println(options.size());
		for(WebElement e:options ) {
			String txt=e.getText();
			System.out.println(txt);
			
			if (txt.contains("choice 1")){
				e.click();
				break;
				
			}
		}
		
		//MultiSelect
		
	}

}
