package com.qa.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class InterfaceImplementation extends TestBase implements SeleniumInterface {

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
			System.out.println("Element not display!!");
		}
		return null;
	}

}
