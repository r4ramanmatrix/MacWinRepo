package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utils.InterfaceImplementation;

public class LoginPage extends TestBase {

	WebDriver driver;

	InterfaceImplementation interfaceMethods = null;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		interfaceMethods = new InterfaceImplementation();
	}

	@FindBy(xpath = "//*[contains(text(),'Log in')]")
	private WebElement loginLink;

	@FindBy(id = "Email")
	private WebElement emailBox;

	@FindBy(id = "Password")
	private WebElement passwordBox;

	@FindBy(xpath = "//*[@type='submit' and @value='Log in'] ")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@class='field-validation-error']/span")
	private WebElement emailIdErrorMessage;

	@FindBy(xpath = "//*[@class='validation-summary-errors']/span")
	private WebElement errorMessage;

	int count = 0;

	public void clickOnLoginLink() {
		loginLink.click();
	}

	public String pageTitle() {
		return driver.getTitle();
	}

	public void enterUserCredentials(String username, String password) {

		interfaceMethods.setText(emailBox, username);
		interfaceMethods.setText(passwordBox, password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public String getEmailErrorMessage() {
		return interfaceMethods.getTextOfElement(emailIdErrorMessage);
	}

	public String getErrorMessage() {
		return interfaceMethods.getTextOfElement(errorMessage);
	}

}
