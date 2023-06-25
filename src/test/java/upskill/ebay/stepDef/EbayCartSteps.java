package upskill.ebay.stepDef;

//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.ebay.pageAction.EbayCartAction;

public class EbayCartSteps {
	EbayCartAction EbayCartActionsObj = new EbayCartAction();
	@When("Select Size")
	public void select_size() throws Throwable {
		EbayCartActionsObj.switchNewWindow();
		EbayCartActionsObj.selectSizeType();
		
	}

	@When("Select Men Size")
	public void select_men_size() throws Throwable {
		EbayCartActionsObj.selectMenSize();
	}

	@When("Select Shade")
	public void select_shade() throws Throwable {
		EbayCartActionsObj.selectShade();
	}

	@When("Select Quantity")
	public void select_quantity() throws Throwable {
		EbayCartActionsObj.enterQuantity();
	}

	@Then("Add to shopping cart")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartActionsObj.addToCart();
	}


}
