package com.omrbranch.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//DataTable
//1D Without Header

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Login.feature",glue = "com.omrbranch.oneDwithout")
public class TestRunnerClass {

}
