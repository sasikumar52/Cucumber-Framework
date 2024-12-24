package com.omrbranch.twoDwithout;

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
	

	@Given("User is on the Fb Login page")
	public void user_is_on_the_fb_login_page() {
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	@When("User Login")
	public void user_login(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> emp = dataTable.asLists();
		List<String> list = emp.get(1);
		String s1 = list.get(0);
		String s2 = list.get(1);
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		
	}
	@Then("User should verify after login success message")
	public void user_should_verify_after_login_success_message() {
		
		
		
		
	}









}
