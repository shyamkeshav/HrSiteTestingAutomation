package ShyamAutomation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ShyamAutomation.frequentmethods.AbstractMethods;

public class FirstPage extends AbstractMethods{
	WebDriver driver;

	public FirstPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(css="button[type='submit']")
	WebElement login;
	
	public void loginintopage(String u_name, String p_word) throws InterruptedException
	{
		username.sendKeys(u_name);
		password.sendKeys(p_word);
		login.click();
		AdminPage ap = new AdminPage(driver);
		ap.GoToAdmin();
		
	}
	
	public Void SiteLaunch()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return null;
	}
	

}