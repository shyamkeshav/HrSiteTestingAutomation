package ShyamAutomation.pageobjects;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShyamAutomation.frequentmethods.AbstractMethods;

import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class AddUser extends AbstractMethods{

	WebDriver driver;
	public AddUser(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements( driver,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div/label[text()='User Role']")
	WebElement UserRole;

	By URole = with(By.className("oxd-select-text-input")).below(UserRole);
	
	@FindBy(xpath="//div/label[text()='Employee Name']")
	WebElement UserName;
	
	By UName = with(By.cssSelector("div[class*='oxd-autocomplete-text-input']")).below(UserName);
	
	
	public void UserAdd(String Input_Uname)
	{
	    Actions KeyAction = new Actions(driver);
	    KeyAction.moveToElement((WebElement) driver.findElements(URole)).click().keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();
	    driver.findElement(UName).sendKeys(Input_Uname);
	    
	}
	
}
