package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {

void addColor(WebElement element,WebDriver driver){
 
 JavascriptExecutor obj = (JavascriptExecutor)driver; //type casting

 obj.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(By.xpath("//*[@class='login']")), "color: red; border: 2px solid red;");
		
		
	}
}
