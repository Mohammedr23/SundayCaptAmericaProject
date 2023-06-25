package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResaultLocators {

	//Validate shoe item
	@FindBy(xpath="//span[2][contains(text(), 'Shoes')]")
	public WebElement txtShoes;
	
	//Validate shirt item
	@FindBy(xpath="//span[2][contains(text(), 'Shirts')]")
	public WebElement txtShirts;
	
	//Validate pants item
	@FindBy(xpath="//span[2][contains(text(), 'Pants')]")
	public WebElement txtPants;
	
	//Check box Adidas
	@FindBy(xpath="//input[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;
	
	//Check box Nike
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;
	
	//Check box Unbranded
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;
	
	//Big and tall cotton tee page
	@FindBy(xpath="//span[contains(text(), 'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT')]")
	public WebElement linkShirtItems;
}
