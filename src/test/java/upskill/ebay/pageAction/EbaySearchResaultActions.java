package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResaultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResaultActions {
	
	EbaySearchResaultLocators EbaySearchResaultLocatorsObj;

	
	public EbaySearchResaultActions() {
	EbaySearchResaultLocatorsObj = new EbaySearchResaultLocators();
	PageFactory.initElements(SetupDrivers.driver,EbaySearchResaultLocatorsObj );

	}
	
	public void varifyShoesItems() {
		// Option 1
		Assert.assertTrue(EbaySearchResaultLocatorsObj.txtShoes.isDisplayed());
		
		//option 2
		Assert.assertEquals("Shoes" , EbaySearchResaultLocatorsObj.txtShoes.getText());
		
		// option 3
		EbaySearchResaultLocatorsObj.txtShoes.isDisplayed();
	}
	
	public void filterBrand(String brand) {
		if (brand.equals("Adidas")){
		EbaySearchResaultLocatorsObj.cbxBrandAdidas.click();
		}
		else if(brand.equals("Nike")) {EbaySearchResaultLocatorsObj.cbxBrandNike.click();
		} else if (brand.equals("Unbranded")) {
		EbaySearchResaultLocatorsObj.cbxBrandUnbranded.click();
		} else {
			System.out.println("Brand not found");
		}
	}
	
	public void verifyBrandItems(String brand) {
		if (brand.equals("Adidas")) {
			Assert.assertTrue(EbaySearchResaultLocatorsObj.txtShirts.isDisplayed());
	 }
		else if (brand.equals("Nike")) {
		         Assert.assertTrue(EbaySearchResaultLocatorsObj.txtShoes.isDisplayed());
	  } 
		else if (brand.equals("Unbranded")) {
		             Assert.assertTrue(EbaySearchResaultLocatorsObj.txtPants.isDisplayed());
	    } 
		   else {
			            System.out.println("No results found");
		}
	}
	
	
	public void selectBigTallTee() throws InterruptedException {
		Thread.sleep(3000);
		EbaySearchResaultLocatorsObj.linkShirtItems.click();
		Thread.sleep(3000);
	}
	
	
}
