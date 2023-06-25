package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.ShettyHomePageLocators;
import upskill.utilities.SetupDrivers;

public class ShettyHomePageActions {
	ShettyHomePageLocators ShettyHomePageLocatorsObj;
	
	public ShettyHomePageActions() {
		ShettyHomePageLocators ShettyHomePageLocatorsObj = new ShettyHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, ShettyHomePageLocatorsObj);
	
	}
	public void loadShettyHomePage() throws  Exception {
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");

}
	public void clickIframe() {             
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));
		for(int i=0; i<framelist.size(); i++)
		SetupDrivers.driver.switchTo().frame(i);         //for loop with index to a dynamic frame.
		
		try {
		ShettyHomePageLocatorsObj.btnHome.click();
	   
		}catch (Exception e) {
		   System.out.println("Element not found in this iFrame");}
	   }
	
	public void verifyShettyHome() throws Exception {
		Thread.sleep(2000);
		/*WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 2);
		explicitWait.until(ExpectedConditions.elementToBeClickable(ShettyHomePageLocatorsObj.btnHome));*/
		ShettyHomePageLocatorsObj.btnHome.isDisplayed();
	   }
	}
