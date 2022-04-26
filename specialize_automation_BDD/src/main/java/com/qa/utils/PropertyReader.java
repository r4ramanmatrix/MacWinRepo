package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static Properties prop;

	static {
		readProperties();
		readDBProperties();
	}

	public static void readProperties() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("configuration/config.properties");
			prop.load(fis);

			System.out.println(prop.getProperty("browser"));
		} catch (IOException e) {

		}
	}

	public static void readDBProperties() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("configuration/DBdetails.properties");
			prop.load(fis);

		} catch (IOException e) {

		}
	}
}
