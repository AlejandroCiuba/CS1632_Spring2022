import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	
	Value value = null;
	Integer val = -1;

	@Given("a Value")
	public void aValue() {
		value = new Value();
	}

	@When("I call getVal")
	public void iCallGetVal() {
		val = value.getVal();
	}

	@When("I call incVal")
	public void iCallIncVal() {
		value.incVal();
	}

	@Then("return value is {int}")
	public void returnValueIs(Integer rval) {
		assertEquals(val, rval);
	}
}
