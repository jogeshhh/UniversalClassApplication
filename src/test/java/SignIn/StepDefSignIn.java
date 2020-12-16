package SignIn;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;

import PageBeans.SignInPageFactory;
import cucumber.api.java.en.*;

public class StepDefSignIn extends BaseClass
{

@Given("^User is on home page")
public void user_Launch_Chrome_browser() throws Throwable {
	System.setProperty("webdriver.edge.driver", "D:\\Capgemini\\Softwares\\edgedriver_win64\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	sipf = new SignInPageFactory(driver);
	driver.get("https://www.universalclass.com/");//launch url application 

}
	

@Then("^go to Main menu and click on Sign$")
public void go_to_Main_menu_and_click_on_Sign() throws Throwable {
	sipf.setPfmenu();
  	sipf.setPfsignin();
}	

@Then("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
public void user_enters_Email_as_and_Password_as(String arg1, String arg2) throws Throwable {
	sipf.setPfuname(arg1); Thread.sleep(1000);
	sipf.setPfpassword(arg2); Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
}

@Then("^User enters Email as kavururajesh(\\d+)@gmailcom and Password as Rajesh@(\\d+)$")
public void user_enters_Email_as_kavururajesh_gmailcom_and_Password_as_Rajesh(String arg1, String arg2) throws Throwable {
	sipf.setPfuname(arg1); Thread.sleep(1000);
	sipf.setPfpassword(arg2); Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
}

@Then("^User enters Email as kavururajesh(\\d+)@gmail\\.com and Password as Raj@(\\d+)$")
public void user_enters_Email_as_kavururajesh_gmail_com_and_Password_as_Raj(String arg1, String arg2) throws Throwable {
	sipf.setPfuname(arg1); Thread.sleep(1000);
	sipf.setPfpassword(arg2); Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
}

@Then("^User enters Email as kavururajesh(\\d+)@gmailcom and Password as Raj@(\\d+)$")
public void user_enters_Email_as_kavururajesh_gmailcom_and_Password_as_Raj(String arg1, String arg2) throws Throwable {
	sipf.setPfuname(arg1); Thread.sleep(1000);
	sipf.setPfpassword(arg2); Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
}

@Then("^Click on Signin$")
public void click_on_Signin() throws Throwable {
	sipf.setPfsin();
	driver.close();
}

//
//@Then("^display signin failed message$")
//public void display_signin_failed_message() throws Throwable {
//	String errormsg = sipf.getPferror();
//	assertArrayEquals("You've entered an invalid Username/Email or Password.", errormsg);
//}

}