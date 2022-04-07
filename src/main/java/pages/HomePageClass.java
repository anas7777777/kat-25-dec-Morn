package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	//This is homepage classs
	@FindBy(xpath="//*[@id='branding']//a[@id='welcome']")
	private WebElement link;
	
	@FindBy(xpath="//*[@id='welcome-menu']/ul/li[3]//a[text()='Logout']")
	private WebElement logoutLink;
	

	
	public HomePageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getProfilelinkElement() {
		return link;
	}
	public WebElement getLogoutLinkElement() {
		return logoutLink;
	}
	

}
