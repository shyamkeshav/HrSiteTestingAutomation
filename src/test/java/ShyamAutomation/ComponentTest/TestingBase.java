package ShyamAutomation.ComponentTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ShyamAutomation.pageobjects.FirstPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingBase {

	public WebDriver driver;

	public WebDriver init_webdriver() throws Exception  {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\AutomationProject\\src\\main\\GBLData.properties");
		prop.load(fis);
		String webdriver = prop.getProperty("Webdriver");
		if (webdriver.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (webdriver.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}

	@BeforeTest
	public FirstPage LaunchPage() throws Exception  {
		driver = init_webdriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FirstPage fp = new FirstPage(driver);
		fp.SiteLaunch();
		return fp;
	}

	@AfterTest
	public void TearDown() {
		driver.close();

	}

	public String getScreenshot(String testcasename,WebDriver driver) throws IOException
	{
		/*TakesScreenshot ts = (TakesScreenshot ) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\User\\eclipse-workspace\\AutomationProject"+"\\reports\\"+ testcasename + ".png");
		FileUtils.copyDirectory(source, file);
		return System.getProperty("User.dir")+"//reports//"+ testcasename + ".png";*/
		
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot) driver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File("C:\\Users\\User\\eclipse-workspace\\AutomationProject"+"\\reports\\"+ testcasename + ".png");
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		return ("C:\\Users\\User\\eclipse-workspace\\AutomationProject"+"//reports//"+ testcasename + ".png");
	}
}
