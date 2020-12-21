package ForgotPassword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageBeans.ForgotPasswordPageFactory;
import PageBeans.SignInPageFactory;
import PageBeans.SubscribePageFactory;
import cucumber.api.java.en.*;
import dataProviders.ConfigFileReader;

public class StepDefForgotPassword
{
	WebDriver driver;
	private ForgotPasswordPageFactory fppf;
	public SubscribePageFactory pfs;
	public SignInPageFactory sipf;
	ConfigFileReader configFileReader;


@Given("^User Launch Chrome browser$")
public void user_Launch_Chrome_browser() throws Throwable {
	configFileReader= new ConfigFileReader();
	System.setProperty("webdriver.edge.driver", configFileReader.getDriverPath());
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		fppf = new ForgotPasswordPageFactory(driver);
		driver.get(configFileReader.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);

}

@When("^User opens URL$")
public void user_opens_URL() throws Throwable {
}

@Then("^go to Main menu and click on Signin$")
public void go_to_Main_menu_and_click_on_Signin() throws Throwable {
	fppf.setPfmenu(); 
	driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
	fppf.setPfsignin(); 
	driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);

}

@Then("^Click on forgot your password$")
public void click_on_forgot_your_password() throws Throwable {
	fppf.setPffpswd();
	driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
}

@Then("^enter valid mail as \"([^\"]*)\"$")
public void enter_valid_mail_as(String arg1) throws Throwable {
	fppf.setPfEnterurmail(arg1);
	driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);

}

@Then("^click on reset password$")
public void click_on_reset_password() throws Throwable {
	 fppf.setPfresetpass();
}

@Then("^enter invalid \"([^\"]*)\"$")
public void enter_invalid(String arg1) throws Throwable {
	fppf.setPfEnterurmail(arg1);
	driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);

}
}
