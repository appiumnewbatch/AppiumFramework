package com.Library;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.appium.java_client.android.AndroidDriver;

public class BaseAutomation {
	public  DesiredCapabilities Capabilities;
	public static AndroidDriver driver;
	public static String sdripath=System.getProperty("user.dir");
	public static String apkpath=sdripath+"\\Apkfile\\Flipkart_com.flipkart.android.apk";
	

	
	@BeforeMethod
	public void setup() throws MalformedURLException{
		
		System.out.println(sdripath);
		
Capabilities=new DesiredCapabilities();
	Capabilities.setCapability("AutomationName", GenericClass.getpropeties("AUTOMATIONNAME"));
	Capabilities.setCapability("platformName",GenericClass.getpropeties("PLATFORMNAME"));
	Capabilities.setCapability("deviceName", GenericClass.getpropeties("DEVICENAME"));
	Capabilities.setCapability("platformVersion",GenericClass.getpropeties("PLATFORMVERSION"));
	Capabilities.setCapability("app", apkpath);
	driver=new AndroidDriver(new URL(GenericClass.getpropeties("URL")), Capabilities);
		
	}
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

	

}
