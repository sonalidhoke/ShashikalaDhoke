package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	//public WebElement ele;
	
	//By Locators
	private By emailInputLocator=By.name("email");
	private By passwordInputLocator=By.name("password");
	private By loginButtonLocator=By.xpath("//input[@type='submit']");
	private By forgottonPasswordLinkLocator=By.linkText("Forgotton Password");
	private By logoutLinkLocator=By.linkText("Logout");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//	page methods /action
	public void enterEmail(String email) {
		WebElement passwordInput=driver.findElement(emailInputLocator);
		passwordInput.sendKeys(email);	
	}
	
	public void enterPassword(String password) {
		WebElement emailInput=driver.findElement(passwordInputLocator);
		emailInput.sendKeys(password);	
	}
	
	public void clickLoginButton() {
		WebElement loginButton=driver.findElement(loginButtonLocator);
		loginButton.click();
	}
	
	public void clickForogottonPasswordLink(){
		WebElement ForgottonPasswordLink=driver.findElement(forgottonPasswordLinkLocator);
		ForgottonPasswordLink.click();	
	}
	
	public boolean checkForogottonPasswordLink(){
		return  driver.findElement(forgottonPasswordLinkLocator).isDisplayed();
			
	}
	
	public boolean checkLogoutLink(){
		return  driver.findElement(logoutLinkLocator).isDisplayed();
			
	}
	
	public void login(String email,String password) {
		enterEmail(email);
		enterPassword(password);
		clickLoginButton();
	}
	
	public String getForgotPwdPageUrl() {
		String forgotPwdPageUrl=driver.getCurrentUrl();
		return forgotPwdPageUrl;
	}
	
	
	
	
}
