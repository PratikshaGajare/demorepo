package academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectrepo.LandingPage;
import pageObjectrepo.LoginPage;
import resources.Base;

public class LoginPageTC extends Base {
	private static Logger log = LogManager.getLogger(LoginPageTC.class.getName());
	public LoginPage l;
	public WebDriver driver;

	@BeforeClass
	public void initilizePage() {
		l = new LoginPage(driver);
	}

	@BeforeTest
	public void browserLogin() {
		driver = browserIntilize();
		log.info("brower successfully open");

	}

	@Test(dataProvider = "dataProvider1")
	public void getAllTC(String username, String password) throws InterruptedException {
		driver.get(prop.getProperty("url2"));
		l.getEmail().sendKeys(username);
		l.getPassword().sendKeys(password);

		l.getSubmit().click();
		Thread.sleep(3000);
	}

	@DataProvider
	public Object[][] dataProvider1() {
		Object[][] obj = new Object[2][2];

		obj[0][0] = "hii@gmail.com";
		obj[0][1] = "hello";

		obj[1][0] = "hii";
		obj[1][1] = "hello";

		/* Object[][] obj = { { "hii@gmail.com", "hello" }, { "dh", "djs" } }; */
		return obj;

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
