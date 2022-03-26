package com.qa.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface SeleniumInterface {

	// **************** Implementing Interface

	public void click(WebElement element);

	public void setText(WebElement element, String str);

	public void mouseOverLink(WebDriver driver, WebElement element);

	public String getTextOfElement(WebElement element);

}
