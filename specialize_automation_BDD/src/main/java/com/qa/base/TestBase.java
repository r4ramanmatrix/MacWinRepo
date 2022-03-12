package com.qa.base;

import org.openqa.selenium.WebDriver;

import com.qa.utils.PropertyReader;

public class TestBase {

	public static WebDriver driver;
	public static String browserName = PropertyReader.prop.getProperty("browser");

	public static void initialization(String url) {
		if (browserName.equalsIgnoreCase("chrome")) {

		}
	}

}
