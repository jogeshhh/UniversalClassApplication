package ForgotPassword;

import org.openqa.selenium.WebDriver;

import PageBeans.ForgotPasswordPageFactory;
import PageBeans.SignInPageFactory;
import PageBeans.SubscribePageFactory;

public class BaseClass 
{
	public WebDriver driver;
	
	public SubscribePageFactory pfs;
	public SignInPageFactory sipf;
	public ForgotPasswordPageFactory fppf;

}
