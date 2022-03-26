package com.qa.utils;

import com.qa.base.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class General_Hooks extends TestBase {

	// create the public methods
	// @Before and @After annotations with the method
	// Specify the package in the runner
	// Inject the Scenario Object in the hook method
	@Before
	public void beforeHook(Scenario name) {
		System.out.println("********** Launching Browser *********");
		System.out.println(name.getName());
		System.out.println(name.getStatus());
	}

	@After
	public void afterHook(Scenario name) {
		System.out.println(name.getName());
		System.out.println(name.getStatus());
		System.out.println("********** Closing Browser *********");
		driver.quit();

	}

	/*@Before("@Test_01_List_Of_String")
	public void Test_01_List_Of_String() {
		System.out.println("Running List of String method before @Before normal hook");
	}*/
}
