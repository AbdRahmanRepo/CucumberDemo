package com.step.com;

import org.openqa.selenium.WebDriver;

import com.runner.com.Runner;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class StepDefenition {
	
	@Given("^user has to on Login page$")
	public void user_has_to_on_Login_page() throws Throwable {
		System.out.println("user has to on Login page");
	}

	@When("^user enters the valid username and password$")
	public void user_enters_the_valid_username_and_password() throws Throwable {
		System.out.println("user enters the valid username and password");
	}

	@When("^user clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		System.out.println("user clicks the login button");

	}

	@Then("^user should navigated to home page$")
	public void user_should_navigated_to_home_page() throws Throwable {
		System.out.println("user should navigated to home page");
	}


}
