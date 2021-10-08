package com.hooks;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BrowserLaunch {
	
	@Before(order=0)    //Ascending Order Execution
	public void setup() {
		System.out.println("Browser Launched Successfully");

	}
	@After(order = 0)	   //Descending order Execution
	public void tearDown() {
		System.out.println("Browser Quited Successfully");

	}
	@Before(order=1)
	public void max() {
		System.out.println("Browser Maximized");

	}
	@After("@simpleLogin") //("@examplesData","@simpleLogin")
	public void quitLogin() {
		System.out.println("Login Page Quited");

	}
	
	@Before("@simpleLogin") //("@examplesData","@simpleLogin")
	public void urlLaunch() {
		System.out.println("URL Launched Successfully");

	}
	@After(order = 1)
	public void quitAllTaps() {
		System.out.println("All Taps Quited Successfully");

	}
}
