	package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Baseconfig;
import com.utility.Highlighter;
import com.utility.Screenshoter;

public class Baselogin_1   {

	public   MasterPageFactory getLogout(WebDriver driver) {
		  
MasterPageFactory obj=new  MasterPageFactory(driver);
Highlighter.addColor(driver, obj.getSignin());
 Screenshoter.	getscreenshot  (driver, "homepage");
 obj.getSignin().click();
 Highlighter.addColor(driver, obj.getEmail());
 obj.getEmail().sendKeys(Baseconfig.getConfigproperties("User"));
 Highlighter.addColor (driver,obj.getPassword());
 obj.getPassword().sendKeys(Baseconfig.getConfigproperties("password"));
 Highlighter.addColor (driver,obj.getLogin());
 Screenshoter.	getscreenshot  (driver, "Login page");
  obj.getLogin().click();
// boolean statusLogin = obj.getLogout().isDisplayed();
// if( obj.getLogout().isDisplayed() ) {
//	 System.out.println("Login passed");
// }else {
//	 System.out.println("login failed");
// }
 return obj;
	 
 }
	
	}
	

		 
