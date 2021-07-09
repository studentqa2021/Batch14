	package com.generic;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Baseconfig;
import com.utility.Highlighter;
import com.utility.Screenshoter;

public class Baselogin_1   {

	public static void logout() {
		  
 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");  //for chrome
WebDriver driver = new ChromeDriver();
	
 driver.navigate().to(Baseconfig.getConfigproperties("URL"));
		
		//  driver.manage().window().fullscreen();
 driver.manage().window().maximize();
 MasterPageFactory obj=new  MasterPageFactory(driver);
 Highlighter.addColor (obj.getLogin(), driver);
 Screenshoter.	getscreenshot  (driver, "homepage");
 obj.getLogin().click();
 obj.getEmail().sendKeys(Baseconfig.getConfigproperties("User"));
 obj.getPassword().sendKeys(Baseconfig.getConfigproperties("password"));
  obj.getLogin().click();
	}
	
}
		 
