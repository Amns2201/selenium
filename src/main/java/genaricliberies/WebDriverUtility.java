package genaricliberies;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * this class contains all reuasble methods of webdriver
 * @author mouni
 *
 */

public class WebDriverUtility {
	private WebDriver driver;
	private Actions a;
	private Select s;
	/**
	 * this method is used to the launch the browser to navigate the application
	 * @param browser
	 * @param url
	 * @param time
	 * @return
	 */
	
	public WebDriver openApplication(String browser,String url,Duration time) {
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			default:
				System.out.println("Invalid browser data");
		}
		driver.manage().window().maximize();
		driver.get("url");
		driver.manage().timeouts().implicitlyWait(time);
		return driver;
	}
	/**
	 * this method is used to wait until element is  visible
	 * @param element
	 * @param time
	 * @return
	 */
		public WebElement excplicitWait(WebElement element,Duration time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		WebElement e = wait.until(ExpectedConditions.visibilityOf(element));
		return e;
		}
		/**
		 * this method is used to mouse hover an element
		 * @param element
		 */
		
		public void mouseHover(WebElement element) {
			a = new Actions(driver);
			a.moveToElement(element).perform();
		}
		/**
		 * this method is used to doublic click on an  element
		 * @param element
		 */
		public void doubleClick(WebElement element) {
			a = new Actions (driver);
			a.doubleClick(element).perform();
		}
		/**
		 * this method is used to right click on an element
		 * @param element
		 */
		 public void rightClick(WebElement element) {
			 a = new Actions(driver);
			 a.contextClick(element).perform();
		 }
		 /**
		  * this method is uesd to drag and drop element an is specifiedtarget location
		  * @param element
		  * @param target
		  */
		 public void dragAndDropElement(WebElement element,WebElement target) {
		 a = new Actions(driver);
		 a.dragAndDrop(element, target).perform();
	}
    /**
     * this element is used to select the element from dropdown based on
     * @param element
     * @param index
     */
		 public void dropdown(WebElement element,int index) {
			 s = new Select(element);
			 s.selectByIndex(index);
		 }
		 /**
		  * 
		  * @param element
		  * @param value
		  */
		 public void dropdown(WebElement element,String value) {
			 s = new Select(element);
			 s.selectByValue(value);
		 }
		 /**
		  * 
		  * @param text
		  * @param element
		  */
		  public void dropdown (String text, WebElement element) {
			  s = new Select(element);
			  s.selectByVisibleText(text);
			 
		 }
		  /**
		   * 
		   * @param idex
		   */
	
	 public void SwitchToFrame(int idex) {
		 driver.switchTo().frame(idex);
		 
	 }
	 /**
	  * 
	  * @param nameOrderId
	  */
	 
	 public void switchToFrame(String nameOrderId) {
		 driver.switchTo().frame(nameOrderId);
	 }
	 /**
	  * this methid is used to switch to frame based on frame element
	  * @param frameElement
	  */
	 public void switchToFrame(WebElement frameElement) {
		 driver.switchTo().frame(frameElement);
	 }
		 /**
		  * this method is used to switch date from frame
		  */
	 
	 public void switchBackFormFrame() {
		 driver.switchTo().defaultContent();
	 }
	 /**
	  * this method is used scorll till element using element reference
	  * @param element
	  */
	 public void scrollTillElement(WebElement element) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].srollIntoview(true)",element);
	 }
	 /**
	  * this method is used tocapture the screenshot of a web page
	  * @param javaUtil
	  */
	  
	 public void takesSreenshot(JavaUtility javaUtil) {
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshot/ss_"+javaUtil.getcurrentTime()+"png");
		 
		 try {
			 FileUtils.copyFile(src,dest);
		 }
		 catch (IOException e) {
			 e.printStackTrace();
		 }
		 }
	 /**
	  * this method is used to handle alert pop up	
	  * @param satus
	  */
		  
		  public void handleAlert(String satus) {
			  Alert al = driver.switchTo().alert();
			  if(satus.equalsIgnoreCase("ok"))
				  al.accept();
			  else
				  al.dismiss();
		 }
		  /**
		   * this method is used to switch to parent windoww
		   */
		  public void switchToParentWindow() {
			  driver.switchTo().window(driver.getWindowHandle());
		  }
		/**
		 * this method is used to handle child browser pop up
		 */
		  
		  public void handleChildBrowser() {
			  Set<String> set = driver.getWindowHandles();
			  for (String wId: set) {
				  driver.switchTo().window(wId);
			  }
		  }
		  /**
		   * this method is used to close  current tab  or window
		   */
		  public void closeCurrenttab() {
			  driver.close();
		  }
		  /**
		   * this method is used to close all tabs and quit the browser
		   */
		  public void quitBrowser() {
			  driver.quit();
			
		
	
		}
	}
		


