package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
	
	 static void logout1() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		MasterPageFactory obj=new MasterPageFactory(driver );
		
		obj.getEmail().sendKeys("646 785 4537");
		//obj.getPaswrd().sendKeys("Jamaica@321");
	//	obj.getLoginbuttn().click();
       // driver.quit();
	 }
	public static void main(String[] args) {
		Facebooklogin.logout1();
	}

	
}

