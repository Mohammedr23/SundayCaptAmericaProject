package upskill.ebay.stepDef;

//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResaultActions;

public class EbaySearchResaultSteps {
	EbaySearchResaultActions EbaySearchResaultActionsObj = new EbaySearchResaultActions();
	
	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		EbaySearchResaultActionsObj.varifyShoesItems();
		Thread.sleep(2000);
;
	}
	
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbaySearchResaultActionsObj.filterBrand(brand);
	    Thread.sleep(2000);

}
	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		EbaySearchResaultActionsObj.verifyBrandItems(brand);
	    Thread.sleep(2000);
	}
	
	
	
	@When("Select the first shirt on item list")
	public void select_the_first_shirt_on_item_list() throws Throwable {
		EbaySearchResaultActionsObj.selectBigTallTee();
	    Thread.sleep(2000);
	}
	
}

	