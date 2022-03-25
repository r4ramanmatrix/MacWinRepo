package com.qa.stepdefinitions;

import com.qa.base.TestBase;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends TestBase {

	@Given("^user naviage to the \"([^\"]*)\" page$")
	public void user_naviage_to_the_page(String url) throws Throwable {
		TestBase.initialization(url);
	}

	@When("^user click on the login link$")
	public void user_click_on_the_login_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user should be on the login page$")
	public void user_should_be_on_the_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^user enters the below credentials and click on login button$")
	public void user_enters_the_below_credentials_and_click_on_login_button(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^user should be on the homepage$")
	public void user_should_be_on_the_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
