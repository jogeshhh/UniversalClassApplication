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

import PageBeans.PaymentPageFactory;
import dataProviders.ConfigFileReader;


public class PaymentTest
{
	WebDriver driver;
	ConfigFileReader configFileReader;
	private PaymentPageFactory objppf;


	@DataProvider
	public Iterator<Object[]> getTestData() throws IOException 
	{
	 ArrayList<Object[]> testData=TestUtil.getPaymentDataFromExcel();	
	 return testData.iterator();
	}

	@BeforeMethod
	public void paymentCart() throws InterruptedException
	{
		System.out.println("@BeforeClass Execution started ");
		
		configFileReader= new ConfigFileReader();
		System.setProperty("webdriver.edge.driver", configFileReader.getDriverPath());
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		objppf = new PaymentPageFactory(driver);
		driver.get(configFileReader.getApplicationUrl());
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		objppf.setPfmaindropdown();
		objppf.setPfsigninoption();
		objppf.setPfuname("Jogeshkumar184@gmail.com");
		objppf.setPfpwd("jogesh1998");
		objppf.setPfsubmitbtn(); Thread.sleep(1000);
		objppf.setPfbrowsecourses(); Thread.sleep(1000);
		objppf.setPfselectcourse();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		objppf.getPffrontdrop();
		objppf.setPfselectclass(); Thread.sleep(1000);
		objppf.setPfjointhiscourse1(); Thread.sleep(1000);
		objppf.setPfaddtocart(); Thread.sleep(1000);
		
	    objppf.setPffinalcheckout();

//		String actualTitle = "Universal Class: Online Courses and Continuing Education";
//		String strTitle = driver.getTitle();
//		System.out.println(strTitle);	
//		Assert.assertEquals(strTitle, actualTitle, "=====Title is not matched====");
			
//	String title = driver.getTitle();
//	System.out.println("current webdriver has this title : "+title);
	
		System.out.println("=========User is on CheckOut page========");
	}

	@Test(dataProvider="getTestData")
	public void paymentPageTest(String CCNo,String CVV, String country, String phoneNo) throws InterruptedException
	{
		System.out.println("This is testNG test Started ");
		
		configFileReader= new ConfigFileReader();
		System.setProperty("webdriver.edge.driver", configFileReader.getDriverPath());
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		objppf = new PaymentPageFactory(driver);
		driver.get(configFileReader.getApplicationUrl());
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		
//		String actualTitle = "Universal Class: Online Courses and Continuing Education";
//		String strTitle = driver.getTitle();
//		System.out.println(strTitle);
//		Assert.assertEquals(strTitle, actualTitle, "=====Title is not matched====");
		
		objppf.setPfpaybox();
		objppf.setPffname("jogesh");	
	    objppf.setPflname("kumar");	
	    objppf.setPfaddress("Rewari");
	    objppf.setPfcity("Rewari");	
	    objppf.setPfstate("Not Listed (none)");	
	    objppf.setPfzip("123401");	
	    objppf.setPfcountry(country);	
	    objppf.setPfphoneNo(phoneNo);	
	    objppf.setPfcctype("Visa");
	    objppf.setPfccnumber(CCNo);	
	    objppf.setPfexpmonth("11");	
	    objppf.setPfexpyear("2024");
	    objppf.setPfcvv(CVV);
	    objppf.setPfcompleteppayment();
	    
	    String failmsg = objppf.getPfpaymentfailmsg().getText();
		String expected = "Sorry, we are not able to validate your credit card information";
		if (failmsg.contains(expected)) {
		    System.out.println("payment details are correct");
		}
		else
		{
			System.out.println("fail msg is : "+failmsg);
		}
	    
	String title = driver.getTitle();
	System.out.println("current webdriver has this title : "+title);
		System.out.println("=========Papment Details entered Successfully========");
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		this.driver.quit();
//		System.out.println("=========All Browsers are closed========");
//	}
}