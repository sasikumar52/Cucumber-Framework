package com.omrbranch.oneDwithout;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	
	@Given("User is on the Amazon Login page")
	public void user_is_on_the_amazon_login_page() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	
	@When("User Search Product")
	public void user_search_product(io.cucumber.datatable.DataTable dataTable) {
		List<String> emp = dataTable.asList();
		String s = emp.get(1);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s,Keys.ENTER);;
		
	}
	@Then("User should verify Same Product listed")
	public void user_should_verify_same_product_listed() {
	}






}
