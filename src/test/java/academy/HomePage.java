package academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectrepo.LandingPage;
import pageObjectrepo.LoginPage;
import resources.Base;

public class HomePage extends Base {
	private static Logger log = LogManager.getLogger(HomePage.class.getName());
	public LandingPage lp;
	public WebDriver driver;

	@BeforeClass
	public void initilizePage() {
		lp = new LandingPage(driver);
	}

	@BeforeTest
	public void browserLogin() {
		driver = browserIntilize();
		log.info("brower successfully open");
		driver.get(prop.getProperty("url"));
		log.info("url successfully open");
		

	}
	public void m1()
	{
		System.out.println("hello");
	}

	/*
	 * @Test public void loginTc() {
	 * 
	 * lp.getLogin().click();
	 * 
	 * }
	 */

	@Test
	public void getTextTc() {

		Assert.assertEquals(lp.getText().getText(), "FEATURED1 COURSES");
		log.info("text successfully get");
	}

	@Test
	public void getnavbarTc() {
		Assert.assertTrue(lp.getnavBar().isDisplayed());
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		log.info("brower successfully close");
	}

}
