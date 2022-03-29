package com.qa.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class InterfaceImplementation extends TestBase implements SeleniumInterface {

	WebDriverWait wait = new WebDriverWait(TestBase.driver, 30l);

	public void click(WebElement element) {
		element.click();
	}

	public void setText(WebElement element, String str) {
		element.clear();
		element.sendKeys(str);

	}

	public void mouseOverLink(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTextOfElement(WebElement element) {
		if (element.isDisplayed()) {
			return element.getText();
		} else {
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		return null;
	}

}
