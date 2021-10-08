package com.runner.com;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.google.com.ZCucumber.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile",
					glue={"com.step.com"},
					monochrome = true,
					tags= {"@Background"}) //'~' symbol indicates Except that following code all are run 
													   //"@dataTable,@simpleLogin" = OR Condition
													   //"@dataTable","@simpleLogin" = AND Condition
													   // "com.hooks"
public class Runner {
//	public static WebDriver driver;
	
//	@BeforeClass
//	public static void setup() {
//
//		driver= BaseClass.launch("chrome");
//	}

}
