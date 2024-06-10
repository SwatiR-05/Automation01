package TestNgSessions;

import org.testng.annotations.*;

public class OpenCartTest {

	// before annotations

	@BeforeSuite
	public void dbConnection() {
		System.out.println("BS -- DB Connection ");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT -- Create User");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-- launchBrowser");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM-- login to app");
	}

	@Test
	public void titleTest() {
		System.out.println("title test");
	}

	@Test
	public void headerTest() {
		System.out.println("title test");
	}

	@Test
	public void urlTest() {
		System.out.println("url test");
	}

	// after Annotations

	@AfterMethod
	public void logout() {
		System.out.println("logout");

	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Close the browser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("user deleted");
	}

	@AfterSuite
	public void disconnectDB() {
		System.out.println("disconnectWithDB");

	}
}
