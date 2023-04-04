package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this class contains all elements and respective business
 * libraries of home page
 * @author mouni
 *
 */

public class Homepage {
	
	//declaration
	@FindBy(xpath = "//img[@alt='SkillRary']")
    private WebElement logo;
	
	@FindBy(xpath = "//a[text()=' GEARS ']  ")
	private WebElement gersTab;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu gear_menu']"+"/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement SkillraryDemoAppLink;
	
	// Intiaization
	public Homepage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
// utilization
	/**
	 * this method returns  skillrary logo
	 * @return
	 */
	public WebElement getLogo() {
		return getLogo();
	}
	/**
	 * this method is used to clickm on gers Tab
	 */
	public void clickGearsTab() {
		gersTab.click();
	}
	/**
	 * this method is used to click on skillrary demo app link
	 */
	public void clickskillraydemoapp() {
		SkillraryDemoAppLink.click();
	}
	 
}
