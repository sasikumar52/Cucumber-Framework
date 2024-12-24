package com.omrbranch.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//DataTable
//2D With Header

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Login3.feature",glue = "com.omrbranch.twoDwith")
public class TestRunnerClass4 {

}
