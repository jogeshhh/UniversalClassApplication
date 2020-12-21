package PageBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignInPageFactory 
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
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement pfpassword;
	
	@FindBy(xpath = "//body/div[@id='maincontainer']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	@CacheLookup
	WebElement pfsin;
	
	@FindBy(xpath = "//body/div[@id='maincontainer']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement pferror;

	public void setPfmenu() 
	{
		pfmenu.click();
	}

	public void setPfsignin() // option from sigIn menu
	{
		pfsignin.click();
	}

	public void setPfuname(String uname) 
	{
		pfuname.clear();
		pfuname.sendKeys(uname);
	}

	public void setPfpassword(String password) 
	{
		pfpassword.clear();
		pfpassword.sendKeys(password);
	}

	public void setPfsin() //submit button
	{
		pfsin.click();
	}
	
	public void setPferror() 
	{
		pferror.getText();
	}


	//Getters
	public WebElement getPfmenu() {
		return pfmenu;
	}

	public WebElement getPfsignin() {
		return pfsignin;
	}

	public WebElement getPfuname() {
		return pfuname;
	}

	public WebElement getPfpassword() {
		return pfpassword;
	}

	public WebElement getPfsin() {
		return pfsin;
	}
	
	public String getPferror() {
		return pferror.getText();
	}

	public SignInPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
