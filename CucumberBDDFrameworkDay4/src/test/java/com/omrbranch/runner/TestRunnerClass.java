package com.omrbranch.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//Cucumber Options

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,publish=true,dryRun = false,monochrome = true,plugin = {"pretty","junit:target\\output.xml"} ,name = {"Verify OmrBranch login with valid credentials"},features = "src\\test\\resources",glue = "com.omrbranch.stepdefinition")
public class TestRunnerClass {

}
