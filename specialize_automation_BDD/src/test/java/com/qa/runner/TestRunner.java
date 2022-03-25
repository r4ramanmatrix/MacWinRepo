package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "resources/features" }, glue = {
		"com.qa.stepdefinitions" }, plugin = {}, monochrome = true, dryRun = true, tags = {})

public class TestRunner {

}
