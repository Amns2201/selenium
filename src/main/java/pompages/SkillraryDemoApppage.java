package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genaricliberies.WebDriverUtility;
/**
 * this class contains all elements and respective business
 * libraries of sillrary demo app page
 * @author mouni
 *
 */

public class SkillraryDemoApppage {

	//declaartion
	@FindBy(xpath = " //div[@class='navbar-header']")
	private WebElement pageHeader;
	
	@FindBy(id = "course")
	private WebElement courseTab;
	
	@FindBy(xpath = "//span/a[text()='Selenium Training']")
	private WebElement seleniumTrainglink;
	
	@FindBy(name = "addresstype")
	private WebElement categoryDropdown;
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactlist;
	
	// Intiaization
		public SkillraryDemoApppage(WebDriver driver) {
			PageFactory.initElements( driver,this);
			
		}
		//utilization  
		/**
		 * thos method returns page header text
		 * @return
		 */
		public String getPageHeadere() {
			return pageHeader.getText();
		}
		/**
		 * this method is used to mouse hover to course tab
		 * @param web
		 */
		public void mouseHoverToCourse(WebDriverUtility web) {
			web.mouseHover(courseTab);
		}
		/**
		 * this method is used to click on selenium tarining link
		 */
	 
		public void clickSeleniumTraining() {
			seleniumTrainglink.click();
		}
		/**
		 * this method is used to choose category from drop down
		 * @param web
		 * @param index
		 */
	  public void selectCategory(WebDriverUtility web, int index) {
	   web.dropdown(categoryDropdown, index);
	  }
	  /**
	   * this method is used to get contact link
	   * @return
	   */
	  public WebElement getContactUsIcon() {
		  return getContactUsIcon();
	  }
	  /**
	   * this method is used to clickk on contact us link
	   */
	 
	  
	  public void clickcontactus(){
		 contactlist.click();
		  
	  }
}
