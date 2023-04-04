package testscripts;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import genaricliberies.BaseClass;

public class Test1  extends BaseClass{
	@Test
	public void test1() {
		SoftAssert soft = new SoftAssert();
		home.clickGearsTab();
		home.clickskillraydemoapp();
		web.handleChildBrowser();
		soft.assertEquals(demoapp.getPageHeadere(),"skillrary-ECommerce");
		
		demoapp.mouseHoverToCourse(web);
		demoapp.clickSeleniumTraining();
		soft.assertEquals(selenium.getPageHeaader(), "Selenium Training" );
	
		selenium.doubleClickAdd(web);
		selenium.clickAddToCart();
		
		web.handleAlert("ok");
		soft.assertEquals(selenium.getItemAddMessage(), "Item add to cart");
		
		soft.assertAll();
	}
	

}
