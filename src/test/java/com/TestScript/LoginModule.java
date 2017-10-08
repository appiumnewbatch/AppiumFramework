package com.TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Library.BaseAutomation;
import com.Library.GenericClass;

public class LoginModule extends BaseAutomation {
	
	
	@Test(priority=1)
	public void loginapplication() throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
		driver.findElement(By.id("com.flipkart.android:id/mobileNo")).clear();
		Thread.sleep(4000);
		driver.findElement(By.id("com.flipkart.android:id/mobileNo")).sendKeys(GenericClass.getpropeties("EMAIL"));
		Thread.sleep(4000);
		driver.findElement(By.id("com.flipkart.android:id/et_password")).sendKeys(GenericClass.getpropeties("PASSWORD"));
		Thread.sleep(4000);
		driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
		Thread.sleep(4000);
		
	}
	
	@Test
	public void homepage(){
		
	}

}
