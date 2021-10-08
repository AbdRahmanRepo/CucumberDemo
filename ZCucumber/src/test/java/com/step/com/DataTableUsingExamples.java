package com.step.com;

import cucumber.api.java.en.*;

public class DataTableUsingExamples {
	@Given("^user has on Login page with Examples$")
	public void user_has_on_Login_page_with_Examples() throws Throwable {
	    System.out.println("user has on Login page with Examples");
	}
	@When("^user will enters the valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_will_enters_the_valid_and(String username, String password) throws Throwable {
		System.out.println(username);
		System.out.println(password);
	    
	}

	@Then("^user should navigated to another page$")
	public void user_should_navigated_to_another_page() throws Throwable {
	    System.out.println("user should navigated to another page");
	}

}
