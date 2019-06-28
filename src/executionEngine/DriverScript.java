package executionEngine;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import config.ActionKeywords;
import utility.ExcelUtils;
import utility.ExtentTestManager;

public class DriverScript extends ExcelUtils {
	public static int iRow;
	

	
	public static String path ="C:\\Users\\shivanandbhad.padiy\\eclipse-workspace\\RestAssured_Project\\src\\dataEngine\\DataEngine.xlsx";

	@Test(priority=1)
public void invokeexcel() throws IOException {
	//method = act.getClass().getMethods();
		ExtentTestManager.startTest("Keyword Driver Test initialization");
		
	ExtentTestManager.getTest().log(Status.INFO,  "This is Stareted to initialize");
    ExcelUtils.setExcel(path, "Test Steps");
	}
	@Test(priority=2)
public void test1() {
		ExtentTestManager.startTest("Keyword Tests");
		ExtentTestManager.getTest().log(Status.INFO,  "Keyword Test");
    for (iRow=1;iRow<=xs.getLastRowNum();iRow++){
    	
    //Storing the value of excel cell in sActionKeyword string variable
    String sActionKeyword = ExcelUtils.getExcel(iRow, 2);
    
    	
    //Comparing the value of Excel cell with all the project keywords
    if(sActionKeyword.equals("openBrowser")){
                       //This will execute if the excel cell value is 'openBrowser'
    //Action Keyword is called here to perform action
    ActionKeywords.openBrowser();
    
    }
    else if(sActionKeyword.equals("navigate")) {
    	ActionKeywords.navigate();	
    }
    else if(sActionKeyword.equals("closeBrowser")) {
    	ActionKeywords.closeBrowser();
    }
    
    }
}
@AfterTest
public void ending() {
	ExtentTestManager.endTest();
	
}

}
