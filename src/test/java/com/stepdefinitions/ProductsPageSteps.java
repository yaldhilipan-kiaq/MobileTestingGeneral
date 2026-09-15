package com.stepdefinitions;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.driver.DeviceSessionManager;
import com.pages.ProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsPageSteps extends BaseClass {

	ProductPage page = new ProductPage(DeviceSessionManager.getDriver());

	@Given("User is on the products page")
	public void user_is_on_the_products_page() {

	}

	@When("User verifies the product")
	public void user_verifies_the_product() {
		visibilityWait(DeviceSessionManager.getDriver(), page.ProductName);
		String actual = page.ProductName.getText();
		String expected = "Air Jordan 4 Retro";

		Assert.assertEquals(expected, actual);
	}

	@When("User verifies the price")
	public void user_verifies_the_price() {
		visibilityWait(DeviceSessionManager.getDriver(), page.Productprice);
		String actual = page.Productprice.getText();
		String expected = "$160.97";

		Assert.assertEquals(expected, actual);
	}

	@When("User clicks add to cart button")
	public void user_clicks_add_to_cart_button() {
		clickableWait(DeviceSessionManager.getDriver(), page.AddtoCart);
		click(DeviceSessionManager.getDriver(), page.AddtoCart);
	}

	@When("User clicks the Cart button")
	public void user_clicks_the_cart_button() {
		clickableWait(DeviceSessionManager.getDriver(), page.CartBTN);
		click(DeviceSessionManager.getDriver(), page.CartBTN);
	}

	@Then("User navigates to Cart Page")
	public void user_navigates_to_cart_page() {

	}

}
