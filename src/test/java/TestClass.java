import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("Swati@gmail.com");
		 * driver.findElement(By.id("input-password")).sendKeys("Swati123");
		 */
		//Approach 2
		/*
		 * WebElement userName=driver.findElement(By.id("input-email")); 
		 * WebElement password= driver.findElement(By.id("input-password"));
		 * userName.sendKeys("Swati@gmail.com"); password.sendKeys("Swati@123");
		 */
	
	//Approach 3
	By userN=By.id("input-email");
	By pass =By.id("input-password");
	
	
	WebElement login= driver.findElement(userN);
	WebElement passW=driver.findElement(pass);
	login.sendKeys("Swati@gmail.com");
	passW.sendKeys("Swati@123");
	
	//Approach 4 [Element Util and Action Util]
	
	}
	
	

	}

