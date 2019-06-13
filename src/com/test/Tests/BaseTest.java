package com.test.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	public WebDriver driver;
public	static ExtentTest test;
public	static ExtentReports report;

    @BeforeClass
    public void setup () {
       System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
 report = new ExtentReports( System.getProperty("user.dir")+"\\ExtentReport.html", true);
 test = report.startTest("Test Started");
 
        //Maximize Window
        driver.manage().window().maximize();
        
        
    }
    
    @Test
    public void starttest() {
test = report.startTest("Launching");
    	driver.get("https://www.google.com");
    }
 
    @AfterClass
    public void teardown () {
        driver.quit();
        report.endTest(test);

        report.flush();

    }
}
