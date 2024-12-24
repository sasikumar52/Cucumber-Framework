package com.omrbranch.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//Scenario Outline

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",glue = "com.omrbranch.stepdefinition")
public class TestRunnerClass {

}
