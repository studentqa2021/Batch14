package com.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.Baselogin_1;
import com.generic.DriverManager;
import com.generic.MasterPageFactory;

public class SmokeTest {
	WebDriver driver2 ;
	//public static void main(String[] args) {
//set up the driver
	@BeforeTest 
	public void getSetup(){
	WebDriver driver2=	new DriverManager ().getDriver();
	}
	//actual code/login
	@Test
	public void getLoginTest() {
		
		MasterPageFactory obj=	new Baselogin_1().getLogout(driver2);
		
		
		//if(obj.getLogout().isDisplayed()) {
	//Assert.assertTrue(obj.getLogout().isDisplayed(),"Login Passed");
	//	}
		//else {
			Assert.assertTrue(obj.getLogout().isDisplayed(),"Login Failed");
			
		}
//	}
		//close browswer
	@AfterTest
	public void getTeardown() {
	
	driver2.quit();
	}
	
}

//}
