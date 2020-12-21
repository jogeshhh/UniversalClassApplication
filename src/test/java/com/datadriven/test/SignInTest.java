package com.datadriven.test;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;
import com.test.utility.TestUtil;

import PageBeans.SignInPageFactory;
import dataProviders.ConfigFileReader;


public class SignInTest
{
	public WebDriver driver;
	public SignInPageFactory sipf;
	ConfigFileReader configFileReader;

	@DataProvider
	public Iterator<Object[]> getTestData() throws IOException 
	{
	 ArrayList<Object[]> testData=TestUtil.getSignInDataFromExcel();	
	 return testData.iterator();
	}

	@BeforeMethod
	public void Homepage() throws InterruptedException
	{
		System.out.println("@BeforeClass Execution started ");
		
		configFileReader= new ConfigFileReader();
		System.setProperty("webdriver.edge.driver", configFileReader.getDriverPath());
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		sipf = new SignInPageFactory(driver);
		driver.get(configFileReader.getApplicationUrl());
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		sipf.setPfmenu();
	  	sipf.setPfsignin();
		
	
		System.out.println("=========User is on Homepage========");
	}

	@Test(dataProvider="getTestData")
	public void SignInPageTest(String email,String password) throws InterruptedException
	{
		System.out.println("Test Execution begins ");
		
		Thread.sleep(1000);
		sipf.setPfuname(email); 
		sipf.setPfpassword(password); 
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		
		sipf.setPfsin();
	    
	String title = driver.getTitle();
	System.out.println("current webdriver has this title : "+title);
	System.out.println("=========Papment Details entered Successfully========");
		
		driver.close();
		
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		this.driver.quit();
//		System.out.println("=========All Browsers are closed========");
//	}
}