package com.stepdefinitions;

import org.junit.Assert;

import com.baseclass.BaseClass;
import com.driver.DeviceSessionManager;
import com.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass {

	HomePage home = new HomePage(DeviceSessionManager.getDriver());

	@Given("User is on the Home Page")
	public void user_is_on_the_home_page() {

	}

	@When("user clicks the Countrty field")
	public void user_clicks_the_countrty_field() {
		clickableWait(DeviceSessionManager.getDriver(), home.countryList);
		click(DeviceSessionManager.getDriver(), home.countryList);
	}

	@When("User selects the Country")
	public void user_selects_the_country() {
		clickableWait(DeviceSessionManager.getDriver(), home.countryName);
		click(DeviceSessionManager.getDriver(), home.countryName);
	}

	@When("User enters name in the name field")
	public void user_enters_name_in_the_name_field() {
		visibilityWait(DeviceSessionManager.getDriver(), home.NameField);
		sendKeys(DeviceSessionManager.getDriver(), home.NameField, "Pepper");

	}

	@When("User selects the Gender")
	public void user_selects_the_gender() {
		clickableWait(DeviceSessionManager.getDriver(), home.female);
		click(DeviceSessionManager.getDriver(), home.female);
	}

	@When("User verifies other gender button")
	public void user_verifies_other_gender_button() {
		clickableWait(DeviceSessionManager.getDriver(), home.male);
		String actual = home.male.getText();
		String expected = "Male";

		Assert.assertEquals(expected, actual);
	}

	@When("User clicks lets shop button")
	public void user_clicks_lets_shop_button() {
		clickableWait(DeviceSessionManager.getDriver(), home.LetsShop);
		click(DeviceSessionManager.getDriver(), home.LetsShop);
	}

	@Then("user should navigates to Products page")
	public void user_should_navigates_to_products_page() {

	}

}
