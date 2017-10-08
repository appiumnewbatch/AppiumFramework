package com.Testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TeSTNG {
	
	@BeforeClass
	public void beforemethod(){
		System.out.println("Launch the application");
	}
	
	@Test(priority=1,enabled=false)
	public void launchapplication(){
		System.out.println("Lauch the applicatiion");
	}
	
	@Test(priority=2)
	public void loginapplication(){
		System.out.println("login to the application");
	}
	
	@Test(priority=3)
	public void verifyhomepage(){
		System.out.println("verify the homepage");
	}
	
	@Test(priority=4)
	public void logoutapplicatiin(){
		System.out.println("Logout to the appliction");
	}

}
