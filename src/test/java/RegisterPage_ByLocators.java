import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage_ByLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	driver.manage().window().maximize();
	//By Locators
	By firstName= By.id("input-firstname");
	By lastNAme= By.id("input-lastname");
	By Mail=By.id("input-email");
	By telNo= By.id("input-telephone");
	By passWord= By.id("Password");
	By pass= By.id("Password Confirm");
	
	
	driver.findElement(firstName).sendKeys("Ritu");
	driver.findElement(lastNAme).sendKeys("Swati");
	driver.findElement(Mail).sendKeys("rituswati@gmail.com");
	driver.findElement(telNo).sendKeys("8020201067");
	
	
	
	
	}

}
