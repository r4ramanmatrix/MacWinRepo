package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(text(),'Log in')]")
	private WebElement loginLink;

	@FindBy(id = "Email")
	private WebElement emailBox;

	@FindBy(id = "Password")
	private WebElement passwordBox;

	@FindBy(xpath = "//*[@type='submit' and @value='Log in'] ")
	private WebElement loginButton;

	public void clickOnLoginLink() {
		loginLink.click();
	}

}
