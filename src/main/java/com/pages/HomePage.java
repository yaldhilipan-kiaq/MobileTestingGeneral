package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	public AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/spinnerCountry\")")
	public WebElement countryList;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Algeria\")")
	public WebElement countryName;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/nameField\")")
	public WebElement NameField;

	@AndroidFindBy(accessibility = "com.androidsample.generalstore:id/radioMale")
	public WebElement male;

	@AndroidFindBy(accessibility = "com.androidsample.generalstore:id/radioFemale")
	public WebElement female;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/btnLetsShop\")")
	public WebElement LetsShop;

}
