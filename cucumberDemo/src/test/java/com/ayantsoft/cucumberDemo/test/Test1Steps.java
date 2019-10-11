package com.ayantsoft.cucumberDemo.test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1Steps {
		
	@Given("^reach to theature$")
	public void reach_to_theature() throws Throwable {
		TestDemo.testCase2();
	
	}

	@When("^go to counter$")
	public void go_to_counter() throws Throwable {
	
	
	}

	@Then("^provide Money$")
	public void provide_Money() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^take ticket$")
	public void take_ticket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^get some butter popcorn$")
	public void get_some_butter_popcorn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^no  popcorn$")
	public void no_popcorn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Take Sanwich$")
	public void take_Sanwich() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^saw movie$")
	public void saw_movie() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	}
