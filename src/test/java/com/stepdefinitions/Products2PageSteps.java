package com.stepdefinitions;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.driver.DeviceSessionManager;
import com.pages.Product2Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Products2PageSteps extends BaseClass {

	Product2Page page1 = new Product2Page(DeviceSessionManager.getDriver());

	@Given("User Clicks Back Button")
	public void user_clicks_back_button() {
		clickableWait(DeviceSessionManager.getDriver(), page1.backBTN);
		click(DeviceSessionManager.getDriver(), page1.backBTN);

	}

	@When("User verifies the new product")
	public void user_verifies_the_new_product() {
		visibilityWait(DeviceSessionManager.getDriver(), page1.ProductName1);
		String actual = page1.ProductName1.getText();
		String expected = "Air Jordan 1 Mid SE";

		Assert.assertEquals(expected, actual);

	}

	@When("User verifies the new price")
	public void user_verifies_the_new_price() {
		visibilityWait(DeviceSessionManager.getDriver(), page1.Productprice1);
		String actual = page1.Productprice1.getText();
		String expected = "$120.0";

		Assert.assertEquals(expected, actual);
	}

	@When("User clicks the add to cart button")
	public void user_clicks_the_add_to_cart_button() {
		clickableWait(DeviceSessionManager.getDriver(), page1.AddtoCart1);
		click(DeviceSessionManager.getDriver(), page1.AddtoCart1);
	}

	@When("User clicks  Cart button")
	public void user_clicks_cart_button() {
		clickableWait(DeviceSessionManager.getDriver(), page1.CartBTN1);
		click(DeviceSessionManager.getDriver(), page1.CartBTN1);
	}

	@Then("User navigates to the Cart Page")
	public void user_navigates_to_the_cart_page() {

	}

}
