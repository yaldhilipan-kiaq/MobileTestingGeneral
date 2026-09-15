package com.baseclass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
	

	 private static final Duration TIMEOUT = Duration.ofSeconds(60); 
	 
	  public static void click(AndroidDriver driver,WebElement element) {

	        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);

	        wait.until(ExpectedConditions.elementToBeClickable(element));

	        element.click();
	    }

	    public static  void sendKeys( AndroidDriver driver, WebElement element,String text) {

	        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);

	        wait.until( ExpectedConditions.visibilityOf(element));

	       // element.click();
	        element.sendKeys(text);
	    }
 

    public static boolean displayed(AndroidDriver driver, WebElement element) {

        return element.isDisplayed();
    }


    

    public static void takeScreenshot(AndroidDriver driver,String fileName) throws Exception {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File("screenshots/" + fileName + ".png");

        FileUtils.copyFile(source, destination);
    }


    

    public static void visibilityWait( AndroidDriver driver, WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver,TIMEOUT);

        wait.until( ExpectedConditions.visibilityOf(element));
    }


    

    public static void clickableWait(AndroidDriver driver,WebElement element) {

        WebDriverWait wait =new WebDriverWait(driver,TIMEOUT);

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }




    public static void swipeUp(
            AndroidDriver driver) {

        driver.executeScript(
                "mobile: swipeGesture",
                Map.of(
                        "left", 100,
                        "top", 100,
                        "width", 200,
                        "height", 600,
                        "direction", "up",
                        "percent", 0.75
                ));
    }


    

    public static void swipeDown(
            AndroidDriver driver) {

        driver.executeScript(
                "mobile: scrollGesture",
                Map.of(
                        "left", 100,
                        "top", 400,
                        "width", 800,
                        "height", 1400,
                        "direction", "down",
                        "percent", 0.9
                ));
    }
}
