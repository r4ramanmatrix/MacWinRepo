package com.qa.stepdefinitions;

import java.util.Map;

import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.utils.PropertyReader;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends TestBase {

	LoginPage loginpage;

	@Given("^user naviage to the \"([^\"]*)\" page$")
	public void user_naviage_to_the_page(String url) throws Throwable {
		TestBase.initialization(url);
		loginpage = new LoginPage(driver);
	}

	@When("^user click on the login link$")
	public void user_click_on_the_login_link() throws Throwable {
		loginpage.clickOnLoginLink();
	}

	@Then("^user should be on the login page$")
	public void user_should_be_on_the_login_page() throws Throwable {
		Assert.assertEquals(loginpage.pageTitle(), PropertyReader.prop.getProperty("login_page_title"));
	}

	@Then("^user enters the below credentials and click on login button$")
	public void user_enters_the_below_credentials_and_click_on_login_button(DataTable data) throws Throwable {
		for (Map<String, String> tableDate : data.asMaps(String.class, String.class)) {
			loginpage.enterUserCredentials(tableDate.get("USERNAME"), tableDate.get("PASSWORD"));
			loginpage.clickOnLoginButton();
			if (loginpage.getEmailErrorMessage().equalsIgnoreCase(PropertyReader.prop.getProperty("email_id_error"))
					|| loginpage.getErrorMessage().equalsIgnoreCase(PropertyReader.prop.getProperty("error_message"))) {
				System.out.println("Incorrect User!!");
			} else {
				continue;
			}
		}
	}

	@Then("^user should be on the homepage$")
	public void user_should_be_on_the_homepage() throws Throwable {
			
	}
}
