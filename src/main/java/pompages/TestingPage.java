package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this class 
 * @author mouni
 *
 */

public class TestingPage {
	// Declartion

	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement pageheader;

	@FindBy(xpath = "//img[@id='Selenium Training']")
	private WebElement seleniumTaringImage;
	

	@FindBy(xpath = "//div[@id='cartArea']")
	private WebElement cartArea;
	

	@FindBy(xpath = "//i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	// Intiaization
			public  TestingPage(WebDriver driver) {
				PageFactory.initElements( driver,this);
				
			}
			//utilization  
			/**
			 * thos method returns page header text
			 * @return
			 */
			public String getPageHeadere() {
				return pageheader.getText();
			}
			/**
			 * this method returns selenium traing image
			 * @return
			 */
				
				public WebElement getSeleniumTrainingImage() {
				return getSeleniumTrainingImage();
			}
	/**
	 * this method returns cart area web element
	 * @return
	 */

}
