package customListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager 
{
	
	private static ExtentReports extentReports;
	
	public static ExtentReports createInstance(String fileName)
	{
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fileName);
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setDocumentTitle(fileName);
		sparkReporter.config().setReportName(fileName);
		
		
		
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("Automation Tester", "Gautam");
		extentReports.setSystemInfo("Orginization", "XYZ Company");
		extentReports.setSystemInfo("Build No", "1234");
		
		
		return extentReports;
		
	}
	

}
