package PracticeSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver launchBrowser(String browserName) {
		System.out.println("Launch the Browser: " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "fireFox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pas the right browser.");
			// throw new BrowserException("browser Not Found");
			break;
		}
		return driver;
	}

	public void launchURL(String url) {
		if (url == null) {
			System.out.println("URL is NULL.");
		}
		if (url.indexOf("http") == 0) {
			driver.get(url);
		} else {
			System.out.println("Http is missing.");

		}

	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
