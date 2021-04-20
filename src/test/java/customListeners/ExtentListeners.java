package customListeners;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ExtentListeners implements ITestListener
{
	static Date d = new Date();
	static String fileName = "Extent_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";

	private static ExtentReports extentReports = ExtentManager.createInstance(System.getProperty("user.dir") + "\\reports\\" +fileName);

	public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) 
	{
		ExtentTest extentTest =	 extentReports.createTest(result.getTestClass().getName()+"  @TestCase : "+result.getMethod().getMethodName());
		testReport.set(extentTest);
	}

	public void onTestSuccess(ITestResult result) 
	{

		String methodName = result.getMethod().getMethodName();
		String logText = "<b>"+ "TEST CASE: "+ methodName.toUpperCase() + "PASSED" +"</b>";
		Markup m =	MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		testReport.get().pass(m);


	}

	public void onTestFailure(ITestResult result) 
	{

		String failureLogg = "Test Case Failed";
		Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.GREEN);
		testReport.get().fail(m);

	}

	public void onTestSkipped(ITestResult result) 
	{


	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{


	}

	public void onStart(ITestContext context) 
	{


	}

	public void onFinish(ITestContext context) 
	{

		if(extentReports != null)
		{
			extentReports.flush();
		}

	}

}
