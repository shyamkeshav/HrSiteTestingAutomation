package ShyamAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class StandTestAlone {

	@Test
	public void test() throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\Automation\\Drivers\\geckodriver\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		   
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		   driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		   driver.findElement(By.cssSelector("button[type='submit']")).click();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//div/ul/li/a/span[text()='Admin']")).click();
		   driver.findElement(By.xpath("//div/nav/ul/li/span[text()='User Management ']")).click();
		   driver.findElement(By.xpath("//div/button[text()=' Add ']")).click();
		   //WebElement UserRole=driver.findElement(By.xpath("//div/label[text()='User Role']"));
		   
		   //Actions a = new Actions(driver);
		   //a.moveToElement(UserRole).click().build().perform();
		   //a.moveToElement(driver.findElement(By.className("oxd-autocomplete-text-input--active"))).keyDown(Keys.ARROW_DOWN).build().perform();
		   
		   //driver.findElement(with(By.className("oxd-select-text-input")).below(UserRole)).click();
		  /* WebElement UserName=driver.findElement(By.xpath("//div/label[text()='Employee Name']"));
		  driver.findElement(with(By.cssSelector("div[class*='oxd-autocomplete-text-input']")).below(UserName)).sendKeys("ad");
		  List<WebElement> USugg = driver.findElements(By.cssSelector("div[class='oxd-autocomplete-dropdown --position-bottom']"));

		  for(WebElement us:USugg)
		  {
			  if(us.getText().equalsIgnoreCase("Odis Adalwin"))
			  {
				  us.click();
				  break;
			  }
		  }*/
		   driver.close();
	}

}
