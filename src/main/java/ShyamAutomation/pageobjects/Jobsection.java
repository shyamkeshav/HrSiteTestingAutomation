package ShyamAutomation.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ShyamAutomation.frequentmethods.AbstractMethods;



public class Jobsection extends AbstractMethods{
	
	WebDriver driver;
	public Jobsection(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div/nav/ul/li/span[text()='Job ']")
	WebElement JobDropDown;
	
	@FindBy(css="a[class='oxd-topbar-body-nav-tab-link']")
	List<WebElement> JobOptions;
	
   public void SelectJob(String JobOpt)
   {
	   //WaitUntilWebElementToAppearin(JobDropDown);
	   JobDropDown.click();
	   if(JobOpt.equalsIgnoreCase("Job Titles")) {
		   JobOptions.stream().filter(s->s.getText().equalsIgnoreCase(JobOpt)).forEach(s->s.click());
	   }
	   
	   else if(JobOpt.equalsIgnoreCase("Pay Grades")) {
		   JobOptions.stream().filter(s->s.getText().equalsIgnoreCase(JobOpt)).forEach(s->s.click());
	   }
	   
	   else if(JobOpt.equalsIgnoreCase("Employment Status")) {
		   JobOptions.stream().filter(s->s.getText().equalsIgnoreCase(JobOpt)).forEach(s->s.click());
	   }
	   
	   else if(JobOpt.equalsIgnoreCase("Job Categories")) {
		   JobOptions.stream().filter(s->s.getText().equalsIgnoreCase(JobOpt)).forEach(s->s.click());
	   }
	   else if(JobOpt.equalsIgnoreCase("Work Shifts")) {
		   JobOptions.stream().filter(s->s.getText().equalsIgnoreCase(JobOpt)).forEach(s->s.click());
		   }
	   
	
   }
}
