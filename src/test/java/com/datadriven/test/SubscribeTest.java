package com.datadriven.test;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.utility.TestUtil;

import PageBeans.SubscribePageFactory;
import dataProviders.ConfigFileReader;


public class SubscribeTest
{
	WebDriver driver;
	ConfigFileReader configFileReader;
	private SubscribePageFactory objpfs;


	@DataProvider
	public Iterator<Object[]> getTestData() throws IOException 
	{
	 ArrayList<Object[]> testData=TestUtil.getSubscribeDataFromExcel();	
	 return testData.iterator();
	}

	@Test(dataProvider="getTestData")
	public void subscribePageTest(String Firstname,String Lastname, String email, String password) throws InterruptedException
	{
		System.out.println("This is testNG test Started ");
		
		configFileReader= new ConfigFileReader();
		System.setProperty("webdriver.edge.driver", configFileReader.getDriverPath());
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		objpfs = new SubscribePageFactory(driver);
		System.out.println(configFileReader.getApplicationUrl());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(configFileReader.getApplicationUrl());
		Thread.sleep(1000);
//		String actualTitle = "Universal Class: Online Courses and Continuing Education";
//		String strTitle = driver.getTitle();
//		System.out.println(strTitle);
//		
//		Assert.assertEquals(strTitle, actualTitle, "=====Title is not matched====");
//		
//		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		
		objpfs.setPfmenu();
		objpfs.setPfSubscribe();
		objpfs.setPfplatinum();
										
		Thread.sleep(1000);
	
		objpfs.setPffname(Firstname);
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		objpfs.setPflname(Lastname);
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		objpfs.setPfemail(email);
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		objpfs.setPfpword(password);
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		objpfs.setPfcheckbox();	//pop box
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);

	objpfs.setPfsignup();

	String title = driver.getTitle();
	System.out.println("current webdriver has this title : "+title);
	
	if (driver.findElement(By.xpath("//div[@id='PopUpContent']")).isDisplayed()) {
		System.out.println("Element is displayed");
	}
		System.out.println("=========Subscribe Details entered Successfully========");
	}
//
//	@AfterMethod
//	public void tearDown()
//	{
//		this.driver.quit();
//		System.out.println("=========All Browsers are closed========");
//	}
}