package com.step.com;

import cucumber.api.java.en.*;

public class RegExpression {
	@Given("^login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_and(String name1, String name2) throws Throwable {
	    System.out.println(name1  +  name2);
	}

	@When("^user gets (\\d+.\\d+) as output$")
	public void user_gets_as_output(float i ) throws Throwable {
	   System.out.println(i);
	}

	@When("^user gives (\\d+) digit number$")
	public void user_gives_digit_number(int num) throws Throwable {
	    System.out.println(num);
	}

}
