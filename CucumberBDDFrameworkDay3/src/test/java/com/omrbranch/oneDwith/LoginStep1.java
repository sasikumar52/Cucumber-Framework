package com.omrbranch.oneDwith;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep1 {

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
		
		Map<String, String> emp = dataTable.asMap();
		String s = emp.get("TV");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s,Keys.ENTER);
		
	}
	@Then("User should verify Same Product listed")
	public void user_should_verify_same_product_listed() {
		
		
	}



}
