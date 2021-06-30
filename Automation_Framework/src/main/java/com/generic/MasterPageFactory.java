package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this );
		
	}
	
	
	@FindBy(xpath="//*[@name='email']")
	private WebElement email;
	
	//@FindBy(xpath="//*[contains(text(),'email')]")
//	private WebElement email;
	
	@FindBy(xpath="//*[@id='pass']")
	private WebElement  paswrd ;
	
	@FindBy(xpath="//*[@name='login']")
	private WebElement loginbuttn ;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPaswrd() {
		return paswrd;
	}

	public WebElement getLoginbuttn() {
		return loginbuttn;
	}
	
}
		
	


