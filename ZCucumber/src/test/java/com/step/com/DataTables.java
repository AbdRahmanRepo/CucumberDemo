package com.step.com;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class DataTables {
	@Given("^user has on Login page$")
	public void user_has_on_Login_page() throws Throwable {
	    System.out.println("user has on Login page");
	}

	@When("^user enters the valid username and password without header$")
	public void user_enters_the_valid_username_and_password_without_header(DataTable Datas) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<String> credentials = Datas.asList(String.class);
		String username = credentials.get(0);
		String password = credentials.get(1);		
	    System.out.println(username);
	    System.out.println(password);
	}
	@When("^user enters the valid username and password with header$")
	public void user_enters_the_valid_username_and_password_with_header(DataTable headerData) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    List<Map<String, String>> mapData = headerData.asMaps(String.class, String.class);
	    String username = mapData.get(0).get("username1");
	    String password = mapData.get(0).get("password1");
	    System.out.println(username);
	    System.out.println(password);
	    
	}
	

	@Then("^user navigated to home page$")
	public void user_navigated_to_home_page() throws Throwable {
	    System.out.println("user navigated to home page");
	}

}
