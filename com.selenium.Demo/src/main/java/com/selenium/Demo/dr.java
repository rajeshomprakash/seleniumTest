package com.selenium.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class dr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Rajesh";
		
		
		
		          System.out.printf ("Welcome to %d", str); 
		      	WebElement element = null;
				 
				WebDriverWait wait = new WebDriverWait(driver, timeout);
				 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tt")));
				 
				return element;
	
	}

}
