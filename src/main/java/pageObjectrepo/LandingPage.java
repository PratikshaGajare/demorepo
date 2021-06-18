package pageObjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
	@FindBy(xpath = "//span[contains(text(),'Login')]")
	private WebElement login;

	@FindBy(xpath = "//h2[contains(text(),'Featured Courses')]")
	private WebElement text;
	
	@FindBy(css= ".nav.navbar-nav.navbar-right")
	private WebElement navBar;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getText() {
		return text;
	}
	public WebElement getnavBar() {
		return navBar;
	}

}
