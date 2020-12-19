package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.utility.TestUtil;


public class SubscribeTest
{
	WebDriver driver;
//private SubscribePageFactory objpfs;


/*
@BeforeMethod
public void setup() 
{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\uday\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.universalclass.com/");
    driver.findElement(By.xpath("//button[@id='clssicon']")).click();	//menu drpdown button
	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/a[4]")).click();	//subscribe option element
	driver.findElement(By.xpath("//body/div[@id='maincontainer']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]")).click();				//choosing the platinum plan
	
	//	objpfs.setPfplatinum();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String windowhandlename = driver.getWindowHandle();
	System.out.println("window handle is :"+windowhandlename);
}
*/

@DataProvider
	public Iterator<Object[]> getTestData() 
	{
		ArrayList<Object[]> testData=TestUtil.getDataFromExcel();	
		return testData.iterator();
	}

@Test(dataProvider="getTestData")
public void subscribePageTest(String Firstname,String Lastname, String email, String password) throws InterruptedException
{
	System.out.println("This is testNG test case 1");
//	objpfs.getPffname().clear();
//	objpfs.setPffname(Firstname);
//	
//	objpfs.getPflname().clear();
//	objpfs.setPflname(Lastname);
//	
//	objpfs.getPfemail().clear();
//	objpfs.setPfemail(email);
//	
//	objpfs.getPfpassword().clear();
//	objpfs.setPfpassword(password);
//	Thread.sleep(1000);
	
//	driver.switchTo().window(windowhandlename);	//to get the handle of login Window
	System.setProperty("webdriver.edge.driver", "D:\\Capgemini\\Softwares\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
//	
	driver.get("https://www.universalclass.com/");
    driver.findElement(By.xpath("//button[@id='clssicon']")).click();	//menu drpdown button
	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/a[4]")).click();	//subscribe option element
	driver.findElement(By.xpath("//body/div[@id='maincontainer']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]")).click();				//choosing the platinum plan
	
	String title = driver.getTitle();
	System.out.println("current webdriver has this title : "+title);
	
	if (driver.findElement(By.xpath("//div[@id='PopUpContent']")).isDisplayed()) {
		System.out.println("Element is displayed");
	}
//	driver.findElement(By.xpath("//h2[@id='pophdr']")).click(); 
									
	Thread.sleep(1000);
//	driver.findElement(By.xpath("xpath = \"//input[@id='givenname']")).clear();
	driver.findElement(By.xpath("//input[@id='givenname']")).sendKeys(Firstname);
	

//	driver.findElement(By.xpath("//input[@id='sn']")).clear();
	driver.findElement(By.xpath("//input[@id='sn']")).sendKeys(Lastname);
	

//	driver.findElement(By.xpath("\"//input[@id='mail']")).clear();
	driver.findElement(By.xpath("//input[@id='mail']")).sendKeys(email);
	

//	driver.findElement(By.xpath("\"//input[@id='userpassword']")).clear();
	driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(password);
	
	driver.findElement(By.xpath("//body/div[@id='maincontainer']/div[@id='myPopUp']/div[@id='PopUpContent']/div[@id='popbdy']/div[1]/form[1]/div[5]/input[1]")).click();
	
	driver.findElement(By.xpath("//body/div[@id='maincontainer']/div[@id='myPopUp']/div[@id='PopUpContent']/div[@id='popbdy']/div[1]/form[1]/div[6]/input[1]")).click();
	
}

//@AfterMethod
//public void tearDown()
//{
//	this.driver.quit();
//}

}