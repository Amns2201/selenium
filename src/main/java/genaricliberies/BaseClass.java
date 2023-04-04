package genaricliberies;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.Homepage;
import pompages.SeleniumTrainingPage;
import pompages.SkillraryDemoApppage;
import pompages.TestingPage;

public class BaseClass {
	protected WebDriverUtility web;
	protected propertyFileYtility property;
	protected ExcelUtility excel;
	protected JavaUtility jUtil;
	protected WebDriver driver;
	protected Homepage home;
	protected SkillraryDemoApppage demoapp;
	protected SeleniumTrainingPage selenium;
	protected TestingPage testing;
	protected ContactUsPage contact;
	//@beforesuite
	//@beforetest
	
	@BeforeClass
	public void ClassConfiguration() {
		web = new WebDriverUtility();
		property = new propertyFileYtility();
		excel = new ExcelUtility();
		jUtil = new JavaUtility();
		
		property.propertyConfig(IconstantPath.Properties_path);
		String browser = property.fectchproperty("browser");
		String url = property.fectchproperty("url");
		long time = Long.parseLong(property.fectchproperty("time"));
	}
	@BeforeMethod
	public void methodConfiguration() {
		excel.excelInitization(IconstantPath.Excel_path);
		
		home = new Homepage(driver);
		demoapp = new SkillraryDemoApppage(driver);
		selenium = new SeleniumTrainingPage(driver);
		testing = new TestingPage(driver);
		contact = new ContactUsPage(driver);
	
	}
		
	@AfterMethod
	public void methodTearDown() {
		excel.closeworkbook();
	}
	 
	@AfterClass
	public void ClasTearDown() {
		
		web.quitBrowser();
	}
	//@AfterTest
	//@AfterSuite

}
