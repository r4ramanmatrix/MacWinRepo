package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utils.InterfaceImplementation;

public class HomePage extends TestBase {

	WebDriver driver;

	InterfaceImplementation interfaceMethods = null;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		interfaceMethods = new InterfaceImplementation();
	}

	@FindBy(xpath = "(//*[@class='account'])[1]")
	private WebElement userDetails;

	@FindBy(xpath = "//*[@class='header']//a")
	private List<WebElement> headerLinks;

	@FindBy(xpath = "(//*[@class='header-menu']/ul)[1]/li/a")
	private List<WebElement> allMenuList;

	public String homepageTitle() {
		return driver.getTitle();
	}

	public boolean isUserNameDisplay() {
		return userDetails.isDisplayed();
	}

	public String getUserName() {
		return interfaceMethods.getTextOfElement(userDetails);
	}

	public int getNumberOfHeaderLinks() {
		return headerLinks.size();
	}

	public void getMenuItems() {
		for (int i = 0; i < allMenuList.size(); i++) {
			if (allMenuList.get(i).getText().equalsIgnoreCase("Books")) {
				allMenuList.get(i).click();
			}
		}
	}

}
