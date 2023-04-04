package testscripts;

import org.testng.asserts.SoftAssert;

import genaricliberies.BaseClass;

public class Test2 extends BaseClass {
	
	public void test2() {
		SoftAssert soft = new  SoftAssert();
		
		home.clickGearsTab();
		home.clickskillraydemoapp();
		web.handleChildBrowser();
		
		soft.assertEquals(demoapp.getPageHeadere(),"SkillRary--ECommerce");
		
		demoapp.selectCategory(web ,1);
		
		soft.assertEquals(testing.getPageHeadere(),"Testing");
		
		web.dragAndDropElement(testing.getSeleniumTrainingImage(),testing.getCartArea());
		
		web.scrollTillElement(testing.getFacebookIcon());
		testing.clickFcebookIcon();
		
		soft.assertAll();
	}
	


}
 