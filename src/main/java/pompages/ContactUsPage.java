package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this method contains element and respective bisiness liberies of contact us page
 * @author mouni
 *
 */

public class ContactUsPage {
	
//declaration
	@FindBy(xpath = "//img[contains(@src,'contactus')]")
    private WebElement contactusicon;
	
	@FindBy(name = "name")
    private WebElement fullnameTF ;
	
	@FindBy(name = "sender")
    private WebElement emailTF;
	
	@FindBy(name = "subject")
    private WebElement subjectTF;
	
	@FindBy(name = "message")
    private WebElement messageTextArea;
	
	@FindBy(xpath = "//button[text()='Send us mail']")
    private WebElement sendUsMailButton;

	// Intiaization
		public ContactUsPage  (WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
		
		//utilization
		/**
		 * this method returns contact us page icon
		 * @return
		 */
		
		public WebElement getContactUsIcon() {
			return getContactUsIcon();
		}
		/**
		 * this method is used to send contact details to skillrary
		 * @param fullname
		 * @param email
		 * @param subject
		 * @param message
		 */

    public void sendContactusInfo(String fullname , String email ,String subject ,String message) {
	
     fullnameTF.sendKeys(fullname);
     emailTF.sendKeys(email);
     subjectTF.sendKeys(subject);
     messageTextArea.sendKeys(message);
     sendUsMailButton.click();
    }
}
     
