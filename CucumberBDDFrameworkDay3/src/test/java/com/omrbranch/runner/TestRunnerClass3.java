package com.omrbranch.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//DataTable
//2D Without Header

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Login2.feature",glue = "com.omrbranch.twoDwithout")
public class TestRunnerClass3 {

}
