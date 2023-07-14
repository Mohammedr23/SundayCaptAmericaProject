package upskill.ebay.stepDef;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.ebay.pageAction.ShettyHomePageActions;

public class ShettyHomePageSteps {
	ShettyHomePageActions ShettyHomePageActionsObj = new ShettyHomePageActions();

	@Given("Open Shetty Homepage")
    public void open_shetty_homepage() throws Throwable {
    Thread.sleep(2000);
    ShettyHomePageActionsObj.loadShettyHomePage();
       }

    @When("Click on iFrame Home")
    public void click_on_i_frame_home() {
    	ShettyHomePageActionsObj.clickIframe();
      }

   @Then("It should reload iframe homepage")
   public void it_should_reload_iframe_homepage() throws Throwable {
	   ShettyHomePageActionsObj.verifyShettyHome();

}

}
