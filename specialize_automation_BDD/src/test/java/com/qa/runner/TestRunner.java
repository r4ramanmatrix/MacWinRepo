package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "resources/features" }, glue = { "com.qa.stepdefinitions", "com.qa.utils" }, plugin = {
		"pretty", "html:target/cucumber-reports" }, monochrome = true, dryRun = false, tags = {})

public class TestRunner {

}
