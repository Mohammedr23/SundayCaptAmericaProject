package upskill.ebay.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
import upskill.api.restassured.PetstoreRestAssuredActions;

public class PetstoreApiSteps {
	
	PetstoreRestAssuredActions obj = new PetstoreRestAssuredActions();
	@Given("^Create pet$")
	public void create_pet() throws Throwable {
		obj.createPet();
	}

	@Given("^Get pet$")
	public void get_pet() throws Throwable {
	    obj.getPet();
	}

	@When("^Update pet$")
	public void update_pet() throws Throwable {
	   obj.updatePet();
	}

	@When("^Delete pet$")
	public void delete_pet() throws Throwable {
	    obj.deletePet();
	}
}
