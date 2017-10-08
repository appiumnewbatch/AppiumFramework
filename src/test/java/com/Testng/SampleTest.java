package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	
	@BeforeSuite
	public void samplebeforesuite(){
		
		System.out.println("The BeforeSuite is exceution");
		
	}
	
	@BeforeTest
	public void samplebeforeTest(){
		
		System.out.println("The BeforeTest is exceution");
		
	}
	
	@BeforeClass
	public void beforeclass(){
		System.out.println("the beforeclass is exceution");
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("the beforemethod is exceution");
	}
	
	@Test
	public void sampleTestngExample(){
		
	System.out.println("THE EXAMPLE FOR TESTNG");
		
	}
	
	
	@AfterSuite
	public void sampleAftersuite(){
		
		System.out.println("The aftersuite is exceution");
		
	}
	
	@AfterTest
	public void sampleAfterstest(){
		
		System.out.println("The aftertest is exceution");
		
	}
	
	@AfterClass
	public void sampleafterclass(){
		System.out.println("THe afterclass is exceution");
	}
	
	@AfterMethod
	public void sampleaftermethod(){
		System.out.println("THe afterMethod is exceution");
	}


}