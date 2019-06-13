package com.testproject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Test1 {
public WebDriver driver;

@Test
public void test1() {
given().when().get("https://www.google.com").then().statusCode(200);
}
@Test
public void test2() {

}
}