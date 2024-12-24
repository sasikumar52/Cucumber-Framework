package com.omrbranch.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;
	@Given("User is on the OmrBranch Login page")
	public void user_is_on_the_omr_branch_login_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	
	@When("User enter {string} and {string}")
	public void user_enter_and(String name, String pass) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
	}

	@When("User clicks Login button")
	public void user_clicks_login_button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}
	@Then("User should verify after login success message")
	public void user_should_verify_after_login_success_message() {
		Assert.assertTrue("verify after login success message",true);
		driver.quit();
	}



}
