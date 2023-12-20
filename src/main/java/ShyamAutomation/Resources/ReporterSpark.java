package ShyamAutomation.Resources;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReporterSpark {

	public  static ExtentReports config()
	{
		String path = "C:\\Users\\User\\eclipse-workspace\\AutomationProject"+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(" dd-MM-YYYY HH-mm-ss");
		reporter.config().setReportName("HR Site Test Result"+sdf.format(d));
		reporter.config().setDocumentTitle("Test Results");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Shyam");
		return extent;
	}
}
