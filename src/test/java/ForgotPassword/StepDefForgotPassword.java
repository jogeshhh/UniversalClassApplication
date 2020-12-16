package ForgotPassword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageBeans.ForgotPasswordPageFactory;
import cucumber.api.java.en.*;

public class StepDefForgotPassword extends BaseClass 
{
	WebDriver driver;
	private ForgotPasswordPageFactory fppf;


@Given("^User Launch Chrome browser$")
public void user_Launch_Chrome_browser() throws Throwable {
	System.setProperty("webdriver.edge.driver", "D:\\Capgemini\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fppf = new ForgotPasswordPageFactory(driver);
		driver.get("https://www.universalclass.com/"); 
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

}

@When("^User opens URL$")
public void user_opens_URL() throws Throwable {
}

@Then("^go to Main menu and click on Signin$")
public void go_to_Main_menu_and_click_on_Signin() throws Throwable {
	fppf.setPfmenu(); Thread.sleep(1000);
	fppf.setPfsignin(); Thread.sleep(1000);
}

@Then("^Click on forgot your password$")
public void click_on_forgot_your_password() throws Throwable {
	fppf.setPffpswd();	Thread.sleep(1000);
}

@Then("^enter valid mail as \"([^\"]*)\"$")
public void enter_valid_mail_as(String arg1) throws Throwable {
	fppf.setPfEnterurmail(arg1);Thread.sleep(1000);
}

@Then("^click on reset password$")
public void click_on_reset_password() throws Throwable {
	 fppf.setPfresetpass();
}

@Then("^enter invalid \"([^\"]*)\"$")
public void enter_invalid(String arg1) throws Throwable {
	fppf.setPfEnterurmail(arg1);Thread.sleep(1000);
}
}
