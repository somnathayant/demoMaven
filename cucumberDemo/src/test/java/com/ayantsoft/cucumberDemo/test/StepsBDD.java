package com.ayantsoft.cucumberDemo.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsBDD {
		
	@Given("^calling each test method$")
	public void calling_each_test_method() throws Throwable {
		TestDemo.testCase2();
		//TestDemo.testCase1();//here we can call any method
	}

	@When("^cal test(\\d+)$")
	public void cal_test(int arg1) throws Throwable {
		TestDemo.testCase1();
		//same here
	}

	@Then("^call  all other methods$")
	public void call_all_other_methods() throws Throwable {
		TestDemo.testCase3();//same here
	}

}
