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

import PageBeans.ForgotPasswordPageFactory;
import PageBeans.SignInPageFactory;
import PageBeans.SubscribePageFactory;
import dataProviders.ConfigFileReader;


public class PasswordTest
{
	WebDriver driver;
	private ForgotPasswordPageFactory fppf;
	public SubscribePageFactory pfs;
	public SignInPageFactory sipf;
	ConfigFileReader configFileReader;

	@DataProvider
	public Iterator<Object[]> getTestData() throws IOException 
	{
	 ArrayList<Object[]> testData=TestUtil.getForgotPasswordDataFromExcel();
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
		fppf = new ForgotPasswordPageFactory(driver);
		driver.get(configFileReader.getApplicationUrl());
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		
	
		System.out.println("=========User is on Homepage========");
	}

	@Test(dataProvider="getTestData")
	public void ForgotPasswordPageTest(String email) throws InterruptedException
	{
		System.out.println("Test Execution begins ");
		
		Thread.sleep(1000);
		
		fppf.setPfmenu(); 
		fppf.setPfsignin();
		fppf.setPffpswd();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		fppf.setPfEnterurmail(email);
		
		 fppf.setPfresetpass();
		
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