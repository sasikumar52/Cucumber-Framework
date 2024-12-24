package com.omrbranch.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

//DataTable
//1D With Header

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Login1.feature",glue ="com.omrbranch.oneDwith")
public class TestRunnerClass2 {

}
