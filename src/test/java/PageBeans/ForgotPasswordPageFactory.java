package PageBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPageFactory
{
WebDriver driver;
	
	//Step 1 : locating the elements
	@FindBy(how=How.ID, using= "clssicon")
	@CacheLookup
	WebElement pfmenu;
	
	@FindBy(xpath = "//span[contains(text(),'Sign In')]")
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
	
	@FindBy(xpath = "//body/div[@id='maincontainer']/div[@id='mainbody']/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
	@CacheLookup
	WebElement pfresetpass;

	public void setPfmenu() 
	{
		pfmenu.click();
	}

	public void setPfsignin() 
	{
		pfsignin.click();
	}

	public void setPfuname(String uname) 
	{
		pfuname.clear();
		pfuname.sendKeys(uname);
	}

	public void setPffpswd()
	{
		pffpswd.click();
	}

	public void setPfEnterurmail(String Enterurmail) 
	{
		pfEnterurmail.clear();
		pfEnterurmail.sendKeys(Enterurmail);;
	}

	public void setPfresetpass() 
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
	

	public ForgotPasswordPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
