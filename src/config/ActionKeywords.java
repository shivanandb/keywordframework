package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
public static WebDriver driver;
public static void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
}

public static void navigate(){ 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("http://www.store.demoqa.com");
	 }
public static void closeBrowser(){ 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.quit();
	 
	 }
public static void closeExcel(){ 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 
	 }

}
