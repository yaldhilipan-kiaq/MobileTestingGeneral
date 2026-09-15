package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CartPage {
	public AndroidDriver driver;

	public CartPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/productName\")")
	public WebElement shoeName;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/productPrice\")")
	public WebElement shoePrice;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Air Jordan 1 Mid SE\")")
	public WebElement shoeName1;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"$120.0\")")
	public WebElement shoePrice1;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/totalAmountLbl\")")
	public WebElement TotalAmount;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Send me e-mails on discounts related to selected products in future\")")
	public WebElement checkbox;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/btnProceed\")")
	public WebElement VisitSite;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Images\")")
	public WebElement newPage;

}
