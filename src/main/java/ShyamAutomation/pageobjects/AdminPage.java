package ShyamAutomation.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShyamAutomation.frequentmethods.AbstractMethods;



public class AdminPage extends AbstractMethods{
	
	WebDriver driver;

	public AdminPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div/ul/li/a/span[text()='Admin']")
	WebElement AdminLink;
	
    By AdminAppear = By.xpath("//div/span/h6[text()='Admin']");
    
    @FindBy(xpath="//div/nav/ul/li/span[text()='User Management ']")
    WebElement UMgmt;
    
    @FindBy(xpath="//ul/li/a[text()='Users']")
    WebElement UserTab;
    
    @FindBy(xpath="//div/button[text()=' Add ']")
    WebElement AddUser;
    
    public void GoToAdmin() throws InterruptedException
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	AdminLink.click();
    	WaitUntilObjectToAppearin(AdminAppear);
    	GoToAddUser();
    }
    
    public void GoToAddUser() throws InterruptedException
    {
    	UMgmt.click();
       //UserTab.click();
       //WaitUntilWebElementToAppearin(AddUser);
    	AddUser.click();
    	Thread.sleep(10000);
    	Jobsection JS =new  Jobsection(driver);
    	//JS.SelectJob("Job Categories");
    	JS.SelectJob("Pay Grades");
    	
    }
    
}
