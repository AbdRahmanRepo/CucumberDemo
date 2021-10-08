package com.step.com;

import cucumber.api.java.en.*;

public class BackgroundClass {
	@Given("^Browser Should Launch$")
	public void browser_Should_Launch() throws Throwable {
	   System.out.println("Browser Launched Successfully");
	}

	@Given("^Url Should Launch$")
	public void url_Should_Launch() throws Throwable {
		System.out.println("Url Launched Successfully");
	}
	
	@Given("^user navigates to Login page$")
	public void user_navigates_to_Login_page() throws Throwable {
	    System.out.println("user navigates to Login page");
	}

	@When("^user enters correct username and password$")
	public void user_enters_correct_username_and_password() throws Throwable {
		System.out.println("user enters correct username and password");
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
		System.out.println("user click login button");
	}

	@Then("^user navigates to home page$")
	public void user_navigates_to_home_page() throws Throwable {
		System.out.println("user navigates to home page");
	}

}
