package testscripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genaricliberies.BaseClass;

@Test

public class Test3 extends BaseClass{
	public void test3() {
		
		SoftAssert soft = new SoftAssert();
		home.clickGearsTab();
		home.clickskillraydemoapp();
		web.handleChildBrowser();
		soft.assertEquals(demoapp.getPageHeadere(),"skillrary-ECommerce");
		
		web.scrollTillElement(demoapp.getContactUsIcon());
		demoapp.clickcontactus();
		
		soft.assertTrue(contact.getContactUsIcon().isDisplayed());

		Map<String,String> map = excel.readData("Sheet1");
		contact.sendContactusInfo(map.get("Full Name "),map.get("Email"),map.get("Subject"),map.get("message"));
		soft.assertAll();;
		
		
	}
	

}
