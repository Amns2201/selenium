package pompages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaricliberies.WebDriverUtility;
/**
 *  this class contains all the elements and respective bussiness 
 *  libraries of selenium Training page
 * @author mouni
 *
 */

public class SeleniumTrainingPage {

	//declaartion
		@FindBy(xpath = "//h1[@class='page-header']")
		private WebElement pageHeader;
		
		@FindBy(xpath ="//button[@id='add']")
		private WebElement plusButton;
		
		@FindBy(xpath = "//button[@ondblclick='addtocart()']")
		private WebElement  addTocartButton;
		
		@FindBy(xpath = "//div[@id='callout']/span")
		private WebElement  itemAddedMessage;
		
		// Intiaization
		public SeleniumTrainingPage  (WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
			// utilization
			/**
			 * this method is used to double click on plus button
			 * @return
			 */
			public String getPageHeaader() {
				return pageHeader.getText();
			}
			/**
			 * this method is used to  double click omn pius button
			 * @param
			 */
			public void doubleClickAdd(WebDriverUtility web) {
				web.doubleClick(plusButton);
			}
			/**
			 * this method is used to click add to cart button
			 */
			public void clickAddToCart(){
				addTocartButton.click();
			}
			/**
			 * this method returns item added meessage
			 * @return
			 */
			public String getItemAddMessage() {
				return itemAddedMessage.getText();
			}
}
				
			
			
			


