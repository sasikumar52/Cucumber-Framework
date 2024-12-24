package com.omrbranch.twoDwith;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	@When("User Login {string} #DataTable always displays last")
	public void user_login_data_table_always_displays_last(String string, io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> emp = dataTable.asMaps();
		Map<String, String> map = emp.get(1);
		String s1 = map.get("Name");
		String s2 = map.get("Password");
		
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);

		
	}
	@Then("User should verify after login success message")
	public void user_should_verify_after_login_success_message() {
	}



}
