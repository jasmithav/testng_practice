package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	@BeforeTest
	public void logintoapplication() {
		System.out.println("Logged In");
	}
	@AfterTest
	public void loggedoutapplication() {
		System.out.println("Logged Out");
	}
	@BeforeMethod
	public void connecttodb() {
		System.out.println("DB Connected");
	}
	@AfterMethod
	public void disconnectfromdb() {
		System.out.println("DB Disconnected");
	}
	@Test(priority=1,description="This is a login test")
	public void loginTest()
	{
		System.out.println("Login is successfull");
	}
	@Test(priority=2,description="This is a logout test")
	public void logoutTest() 
	{
	    System.out.println("Logout is successfull");	
	}

}
