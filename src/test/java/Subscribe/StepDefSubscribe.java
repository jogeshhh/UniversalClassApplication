package Subscribe;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.*;
import PageBeans.SubscribePageFactory;

public class StepDefSubscribe extends BaseClass
{
	private SubscribePageFactory objpfs;
	
@Given("User Launch Chrome browser")
public void user_Launch_Chrome_browser() throws Exception {
	System.setProperty("webdriver.edge.driver", "D:\\Capgemini\\Softwares\\edgedriver_win64\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objpfs = new SubscribePageFactory(driver);
}

@When("User opens URL")
public void user_opens_URL() throws Exception {
	driver.get("https://www.universalclass.com/");
}

@Then("^go to Main menu and click on Subscribe$")
public void go_to_Main_menu_and_click_on_Subscribe() throws Exception
{
	objpfs.setPfmenu();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objpfs.setPfSubscribe();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Then("^click on any Plantium to Start$")
public void click_on_any_Plantium_to_Start() throws Throwable 
{
	objpfs.setPfplatinum();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}


@When("^User enter Valid Firstname\"([^\"]*)\" , Lastname \"([^\"]*)\" , Email \"([^\"]*)\"  and Password \"([^\"]*)\"$")
public void user_enter_Valid_Firstname_Lastname_Email_and_Password(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	objpfs.setPffname(arg1);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objpfs.setPflname(arg2);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objpfs.setPfemail(arg3);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objpfs.setPfpword(arg4);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^Click on Checkbox to agree terms and coditions$")
public void click_on_Checkbox_to_agree_terms_and_coditions() throws Throwable
{
	objpfs.setPfcheckbox();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^Click on Signup$")
public void click_on_Signup() throws Throwable 
{
	objpfs.setPfsignup();
	driver.close();
}


@When("^User enter valid Firstname \"([^\"]*)\" , Lastname \"([^\"]*)\" , Email \"([^\"]*)\"  and Password \"([^\"]*)\"$")
public void user_enter_valid_Firstname_Lastname_Email_and_Password(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	objpfs.setPffname(arg1);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objpfs.setPflname(arg2);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objpfs.setPfemail(arg3);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objpfs.setPfpword(arg4);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}



}



