package PracticeSession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement Search = driver.findElement(By.name("q"));
		Search.sendKeys("Selenium");
		List<WebElement> AutoSugg = driver
				.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@class=\"wM6W7d\"]/span"));

		System.out.println(AutoSugg.size());
		for (WebElement e : AutoSugg) {
			String txt = e.getText();
			// System.out.println(txt);
			if (txt.contains("questions")) {
				e.click();

				break;
			}
		}

	}
}
