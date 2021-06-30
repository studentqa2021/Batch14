	package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BaseConfig1;

public class Baselogin_1 implements Login  {

	@Override
	public void logout() {
		  
		  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");  //for chrome
			WebDriver driver = new ChromeDriver();
		//	driver.get("www.facebook.com");
		  driver.navigate().to(BaseConfig1.getConfigValue1("URL"));
		//  driver.navigate().refresh();	
		//  driver.navigate().forward();
		//  driver.navigate().back();
		//  driver.manage().window().fullscreen();
		  driver.manage().window().maximize();
		  MasterPageFactory obj=new  MasterPageFactory(driver);
		  obj.getLoginbuttn().click();
		  obj.getEmail().sendKeys(BaseConfig1.getConfigValue1("User"));
		  obj.getPaswrd().sendKeys(BaseConfig1.getConfigValue1("password"));
		  obj.getLoginbuttn().click();
		 // driver.findElement(By.xpath("//*[@class='login']")).click();
		  
		  //looking for single object in my object
  //driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sarowerny@gmail.com");
 // driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("student");
// driver.findElement(By.xpath("//*[@class='button btn btn-default button-medium']")).click();
// driver.quit();
	}
}
	
	

