package com.motorola.training.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class SimpleStorySteps {
	@Given("some precondition")
	public void pre() {}
	
	@When("some action is performed")
	public void action() {}
	
	@Then("some output is expected")
	public void post() {}
}
