package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePageLocators {

	// search text box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	//Search Button
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;
	
	// My eBay mouse hover over
	@FindBy(xpath="//a[@title='My eBay']")
	public WebElement linkMyEbay;
	
	// My eBay Search
	@FindBy(xpath="//a[contains(text(),'Summary')]")
	public WebElement linkSummery;

}
