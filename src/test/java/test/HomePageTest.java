package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.HomePageClass;

public class HomePageTest extends BaseTest {
	
	HomePageClass hp;
	@BeforeSuite
	public void initObject() {
		hp=new HomePageClass(driver);
		
	}
	@Test
  public void logout() {
		
		hp.getProfilelinkElement().click();
		hp.getLogoutLinkElement().click();
  }
	
	
	
	
	
	
	
	
	
	
}
