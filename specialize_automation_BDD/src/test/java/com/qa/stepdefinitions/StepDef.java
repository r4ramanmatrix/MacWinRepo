package com.qa.stepdefinitions;

import com.qa.base.TestBase;

import cucumber.api.DataTable;
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

	}

	@Then("^user should be on the login page$")
	public void user_should_be_on_the_login_page() throws Throwable {

	}

	@Then("^user enters the below credentials and click on login button$")
	public void user_enters_the_below_credentials_and_click_on_login_button(DataTable arg1) throws Throwable {

	}

	@Then("^user should be on the homepage$")
	public void user_should_be_on_the_homepage() throws Throwable {

	}
}
