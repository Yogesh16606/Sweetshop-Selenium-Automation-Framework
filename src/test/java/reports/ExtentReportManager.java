package reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentReportManager {

    private static final ThreadLocal<ExtentTest> test =
            new ThreadLocal<>();

    public static ExtentTest getTest() {

        return test.get();
    }

    public static void setTest(
            ExtentTest extentTest) {

        test.set(extentTest);
    }
}