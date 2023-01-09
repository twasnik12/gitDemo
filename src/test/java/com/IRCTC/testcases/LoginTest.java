package com.IRCTC.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.IRCTC.commons.TestBase;
import com.IRCTC.pages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage loginpage;
	
	public LoginTest() throws IOException
	{
		super();
	}
	@BeforeMethod()
	public void setup()throws Exception
	{
		launch();
		loginpage = new LoginPage();
	}	
	@Test
	public void logintest1() throws Exception
	{
		loginpage.Login();	
	}
		
	@AfterMethod()
	public void TearDown()
	{
		driver.close();
	}
	}

