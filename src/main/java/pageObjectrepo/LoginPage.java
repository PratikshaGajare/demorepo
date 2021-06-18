package pageObjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath = "//input[@id='user_email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='user_password']")
	private WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//span[contains(text(),'Login')]")
	private WebElement login;
	@FindBy(xpath = "//div[@class='sumome-react-svg-image-container']")
	private WebElement frame;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getFreame() {
		return frame;
	}
}
