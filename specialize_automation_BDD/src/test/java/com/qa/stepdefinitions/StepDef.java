package com.qa.stepdefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utils.PropertyReader;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends TestBase {

	public static List<String> allErrors = new ArrayList<String>();

	LoginPage loginpage = null;
	HomePage homepage = null;

	@Given("^user naviage to the \"([^\"]*)\" page$")
	public void user_naviage_to_the_page(String url) throws Throwable {
		TestBase.initialization(url);
	}

	@When("^the user click on the login link$")
	public void user_click_on_the_login_link() throws Throwable {
		loginpage = new LoginPage(TestBase.driver);
		loginpage.clickOnLoginLink();

	}

	@Then("^the user should be on the login page$")
	public void user_should_be_on_the_login_page() throws Throwable {
		Assert.assertEquals(loginpage.pageTitle(), PropertyReader.prop.getProperty("login_page_title"));
	}

	@Then("^user enters the below credentials and click on login button$")
	public void user_enters_the_below_credentials_and_click_on_login_button(DataTable data) throws Throwable {

		for (Map<String, String> tableDate : data.asMaps(String.class, String.class)) {
			loginpage.enterUserCredentials(tableDate.get("USERNAME"), tableDate.get("PASSWORD"));
			loginpage.clickOnLoginButton();
			allErrors.addAll(loginpage.errorLists());
		}
		if (allErrors.contains(PropertyReader.prop.getProperty("email_id_error"))) {
			System.out.println("Error!!");
		}

	}

	@Then("^the user should be on the homepage$")
	public void user_should_be_on_the_homepage() throws Throwable {
		homepage = new HomePage(driver);
		System.out.println("Homepage title is:: " + homepage.homepageTitle());

	}

	@Then("^user verify the username on the homepage$")
	public void user_verify_the_username_on_the_homepage() throws Throwable {

	}
}
