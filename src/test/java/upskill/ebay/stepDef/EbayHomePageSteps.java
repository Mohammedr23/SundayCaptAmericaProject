package upskill.ebay.stepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomePageSteps {

	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();

	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		Thread.sleep(2000);
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomepageActionsObj.searchShoes();
		Thread.sleep(2000);
	}

	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomepageActionsObj.searchItem(items);
		Thread.sleep(2000);

	}

	@Given("Search for Big Tall Cotton Tee")
	public void search_for_big_tall_cotton_tee() throws Throwable {
		EbayHomepageActionsObj.searchItem("Big & Tall Cotton Tee");
	}

	@When("Mouse Hover to MyEbay Summary")
	public void mouse_hover_to_my_ebay_summary() throws Exception {
		EbayHomepageActionsObj.mouseHoverOver();
		Thread.sleep(3000);
	}

	@Then("Click on Summary")
	public void click_on_summary() throws Exception {
		EbayHomepageActionsObj.clickSummary();
	}
}