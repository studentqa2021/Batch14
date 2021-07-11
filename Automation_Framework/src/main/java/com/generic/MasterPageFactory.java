package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(text(),'Sign in')]")
	private WebElement signin;
	@FindBy(xpath = "(//*[contains(@id,'email')])[2]")
	private WebElement email;
	@FindBy(xpath = "//*[contains(@id,'passwd')]")
	private WebElement password;
	@FindBy(xpath = "//*[@class='icon-lock left']")
	private WebElement login;

	@FindBy(xpath = "(//*[contains(text(),'Sign out')])[1]")
	private WebElement logout;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLogout() {
		return logout;
	}

}
