package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "test-output/ExtentReport.html");

            extent = new ExtentReports();

            extent.attachReporter(spark);
            
            System.out.println("ExtentReports initialized");

            extent.setSystemInfo(
                    "Framework",
                    "Selenium Cucumber Java");

            extent.setSystemInfo(
                    "Execution",
                    "Local");
            
            extent.setSystemInfo(
                    "Author",
                    "Yogesh");

            extent.setSystemInfo(
                    "Java Version",
                    System.getProperty("java.version"));

            extent.setSystemInfo(
                    "OS",
                    System.getProperty("os.name"));

            extent.setSystemInfo(
                    "OS Version",
                    System.getProperty("os.version"));
            
            extent.setSystemInfo(
                    "User",
                    System.getProperty("user.name"));

            extent.setSystemInfo(
                    "Browser",
                    "Chrome");        
        }

        return extent;
    }
}
