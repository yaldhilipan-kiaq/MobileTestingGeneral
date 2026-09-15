package com.stepdefinitions;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.driver.DeviceSessionManager;
import com.pages.CartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageSteps extends BaseClass {

	CartPage cart = new CartPage(DeviceSessionManager.getDriver());

	@Given("User is on the Cart Page")
	public void user_is_on_the_cart_page() {

	}

	@When("User Verifies the Shoe is added")
	public void user_verifies_the_shoe_is_added() {
		visibilityWait(DeviceSessionManager.getDriver(), cart.shoeName);
		String actual = cart.shoeName.getText();
		String expected = "Air Jordan 4 Retro";

		Assert.assertEquals(expected, actual);
	}

	@When("User verifies the Shoe price")
	public void user_verifies_the_shoe_price() {

		visibilityWait(DeviceSessionManager.getDriver(), cart.shoePrice);
		String actual1 = cart.shoePrice.getText();
		String expected1 = "$160.97";

		Assert.assertEquals(actual1, expected1);
	}

	@When("User Verifies the second product is added")
	public void user_verifies_the_second_product_is_added() {
		visibilityWait(DeviceSessionManager.getDriver(), cart.shoeName1);
		String actual = cart.shoeName1.getText();
		String expected = "Air Jordan 1 Mid SE";

		Assert.assertEquals(expected, actual);
	}

	@When("User verifies the second product price")
	public void user_verifies_the_second_product_price() {
		visibilityWait(DeviceSessionManager.getDriver(), cart.shoePrice1);
		String actual1 = cart.shoePrice1.getText();
		String expected1 = "$120.0";

		Assert.assertEquals(actual1, expected1);

	}

	@When("User verifies the Total Purchase Amount")
	public void user_verifies_the_total_purchase_amount() {
		visibilityWait(DeviceSessionManager.getDriver(), cart.TotalAmount);
		String actual1 = cart.TotalAmount.getText();
		String expected1 = "$ 280.97";

		Assert.assertEquals(actual1, expected1);
	}

	@When("User clicks the Checkbox")
	public void user_clicks_the_checkbox() {
		clickableWait(DeviceSessionManager.getDriver(), cart.checkbox);
		click(DeviceSessionManager.getDriver(), cart.checkbox);
	}

	@When("User clicks visit official site")
	public void user_clicks_visit_official_site() {
		clickableWait(DeviceSessionManager.getDriver(), cart.VisitSite);
		click(DeviceSessionManager.getDriver(), cart.VisitSite);
	}

	@Then("It navigates to new page")
	public void it_navigates_to_new_page() {

	}

}
