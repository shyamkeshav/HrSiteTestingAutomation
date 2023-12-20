package ShyamAutomation.frequentmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractMethods {


WebDriver driver;

public AbstractMethods(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void WaitUntilObjectToAppearin(By findby)
{
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
}
public void WaitUntilWebElementToAppearin(WebElement findby)
{
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.invisibilityOf(findby));
}
public void WaitUntilObjectToDisappearout(WebElement findby)
{
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.invisibilityOf(findby));
}
}	

