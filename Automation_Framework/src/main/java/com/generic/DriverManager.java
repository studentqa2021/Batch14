package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Baseconfig;

public class DriverManager {
public	 WebDriver getDriver() {
		 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");  //for chrome
		 WebDriver driver = new ChromeDriver();
		 	
		  driver.navigate().to(Baseconfig.getConfigproperties("URL"));
		 		
		 		//  driver.manage().window().fullscreen();
		  driver.manage().window().maximize();
		  return driver;
	}

}
