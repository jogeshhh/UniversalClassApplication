package PageBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPasswordPageFactory
{
	WebDriver driver;
	
//Step 1 : locating the elements
	@FindBy(how=How.ID, using= "clssicon")
	@CacheLookup
	WebElement pfmenu;
	
	@FindBy(xpath = "//body/div[@id='maincontainer']/div[2]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement pfsignin;
	
	@FindBy(how=How.NAME, using="username")
	@CacheLookup
	WebElement pfuname;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	@CacheLookup
	WebElement pffpswd;
	
	@FindBy(how=How.NAME, using="Email")
	@CacheLookup
	WebElement pfEnterurmail;
	
	@FindBy(how=How.NAME, using="SubmitButton")
	@CacheLookup
	WebElement pfresetpass;

	public void setPfmenu(WebElement pfmenu) 
	{
		pfmenu.click();
	}

	public void setPfsignin(WebElement pfsignin) 
	{
		pfsignin.click();
	}

	public void setPfuname(String uname) 
	{
		pfuname.sendKeys(uname);
	}

	public void setPffpswd(WebElement pffpswd) 
	{
		pffpswd.click();
	}

	public void setPfEnterurmail(String Enterurmail) 
	{
		pfEnterurmail.sendKeys(Enterurmail);;
	}

	public void setPfresetpass(WebElement pfresetpass) 
	{
		pfresetpass.click();
	}
	
// getters
	public WebElement getPfmenu() {
		return pfmenu;
	}

	public WebElement getPfsignin() {
		return pfsignin;
	}

	public WebElement getPfuname() {
		return pfuname;
	}

	public WebElement getPffpswd() {
		return pffpswd;
	}

	public WebElement getPfEnterurmail() {
		return pfEnterurmail;
	}

	public WebElement getPfresetpass() {
		return pfresetpass;
	}
	

}
