package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Product2Page {

	public AndroidDriver driver;

	public Product2Page(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(0)")
	public WebElement backBTN;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Air Jordan 1 Mid SE\")")
	public WebElement ProductName1;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"$120.0\")")
	public WebElement Productprice1;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(1)")
	public WebElement AddtoCart1;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/appbar_btn_cart\")")
	public WebElement CartBTN1;

}
