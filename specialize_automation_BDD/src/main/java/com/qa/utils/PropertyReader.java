package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static Properties prop;

	static {
		readProperties();
	}

	public static void readProperties() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("resources/config.properties");
			prop.load(fis);

			System.out.println(prop.getProperty("browser"));
		} catch (IOException e) {

		}
	}
}
