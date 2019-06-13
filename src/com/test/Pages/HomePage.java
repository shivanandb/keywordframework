package com.test.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}
	   String baseURL = "https://www.swtestacademy.com/extentreports-testng/";
	   
	   public HomePage goToswTest() {
		   
		   driver.get(baseURL);
		return this;
 	   }

	   
	   
}
