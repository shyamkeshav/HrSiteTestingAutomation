package ShyamAutomation;

import org.testng.annotations.Test;

import ShyamAutomation.ComponentTest.TestingBase;
import ShyamAutomation.pageobjects.FirstPage;

public class SimpleTest {
	
	@Test
	public void TestInBtw() throws Exception 
	{
		TestingBase bt = new TestingBase();
		FirstPage fp=bt.LaunchPage();
		fp.SiteLaunch();
		fp.loginintopage("Admin","admin12345");	
	}
}
