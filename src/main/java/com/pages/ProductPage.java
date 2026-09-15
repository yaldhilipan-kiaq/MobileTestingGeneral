package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductPage {
	public AndroidDriver driver;

	public ProductPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Air Jordan 4 Retro\")")
	public WebElement ProductName;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"$160.97\")")
	public WebElement Productprice;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/productAddCart\").instance(0)")
	public WebElement AddtoCart;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/appbar_btn_cart\")")
	public WebElement CartBTN;

}
