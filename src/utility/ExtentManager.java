package utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
public static ExtentReports extent;

public static String reportName = "Test Execution";

public static ExtentReports getInstance() {
    if (extent == null)
        createInstance();
    return extent;
}
//Create an extent report instance
public static ExtentReports createInstance() {

	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/ShivtestReport.html");
	htmlReporter.config().setTheme(Theme.STANDARD);
	htmlReporter.config().setReportName(reportName);
	 extent = new ExtentReports();
	 extent.attachReporter(htmlReporter);
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("AUT", "QA");
	// extent.flush();
	return extent;
	
}


}
