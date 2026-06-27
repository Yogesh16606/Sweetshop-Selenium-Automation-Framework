package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;
import utilities.FrameworkConstants;
import utilities.ScreenshotUtil;
import drivers.DriverInstance;

import com.aventstack.extentreports.Status;
import io.cucumber.java.Scenario;
import reports.ExtentManager;
import reports.ExtentReportManager;

public class Hooks {

	@Before
	public void setup(Scenario scenario) {

	    DriverFactory.launchApplication();

	    ExtentReportManager.setTest(
	            ExtentManager.getInstance()
	                    .createTest(scenario.getName()));

	    System.out.println(
	            FrameworkConstants.BROWSER_LAUNCH_MESSAGE);
	}
	
	@After
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {

		    String screenshotPath =
		            ScreenshotUtil.captureScreenshot(
		                    scenario.getName());

		    ExtentReportManager
		            .getTest()
		            .fail("Scenario Name : " + scenario.getName());

		    ExtentReportManager
		            .getTest()
		            .fail("Execution Status : FAILED");

		    ExtentReportManager
		            .getTest()
		            .fail("Screenshot captured at failure point.")
		            .addScreenCaptureFromPath(screenshotPath);

		} else {

		    ExtentReportManager
		            .getTest()
		            .pass("Scenario Name : " + scenario.getName());

		    ExtentReportManager
		            .getTest()
		            .pass("Execution Status : PASSED");
		}

	    ExtentManager
	            .getInstance()
	            .flush();

	    if (DriverInstance.driver != null) {

	        DriverInstance.driver.quit();
	        DriverInstance.driver = null;

	        System.out.println(
	                FrameworkConstants.BROWSER_CLOSE_MESSAGE);
	    }
	}
}	