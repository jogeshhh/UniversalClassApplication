package PageBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SubscribePageFactory
{
	public WebDriver driver;

	public SubscribePageFactory(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Step 1 : locating the elements
	@FindBy(xpath = "//button[@id='clssicon']")
	@CacheLookup
	WebElement pfmenu;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/a[4]")
	@CacheLookup
	WebElement pfSubscribe;
	
	@FindBy(xpath="//body/div[@id='maincontainer']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]")
	@CacheLookup
	WebElement pfplatinum;
	
	@FindBy(xpath = "//input[@id='givenname']")
	@CacheLookup
	WebElement pffname;
	
	@FindBy(xpath = "//input[@id='sn']")
	@CacheLookup
	WebElement pflname;
	
	@FindBy(xpath = "//input[@id='mail']")
	@CacheLookup
	WebElement pfemail;
	
	@FindBy(xpath = "//input[@id='userpassword']")
	@CacheLookup
	WebElement pfpword;
	
	@FindBy(xpath = "//body/div[@id='maincontainer']/div[@id='myPopUp']/div[@id='PopUpContent']/div[@id='popbdy']/div[1]/form[1]/div[5]/input[1]")
	@CacheLookup
	WebElement pfcheckbox;
	
	@FindBy(xpath = "//body/div[@id='maincontainer']/div[@id='myPopUp']/div[@id='PopUpContent']/div[@id='popbdy']/div[1]/form[1]/div[6]/input[1]")
	@CacheLookup
	WebElement pfsignup;
	

	@FindBy(xpath = "//body/div[@id='maincontainer']/div[2]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement pfsignin;
	
	@FindBy(how=How.NAME, using="username")
	@CacheLookup
	WebElement pfuname;
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement pfpassword;
	
	@FindBy(how=How.NAME, using="SubmitButton")
	@CacheLookup
	WebElement pfsin;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	@CacheLookup
	WebElement pffpswd;
	
	@FindBy(how=How.NAME, using="Email")
	@CacheLookup
	WebElement pfEnterurmail;
	
	@FindBy(how=How.NAME, using="SubmitButton")
	@CacheLookup
	WebElement pfresetpass;
	
// setters
	public void setPfmenu() 
	{
		pfmenu.click();
		
	}

	public void setPfSubscribe() 
	{
		pfSubscribe.click();
	}

	public void setPfplatinum() 
	{
		pfplatinum.click();
	}

	public void setPffname(String sname) 
	{	
		pffname.click();
		pffname.clear();
		pffname.sendKeys(sname);
	}

	public void setPflname(String sname) 
	{	
		pflname.click();
		pflname.clear();
		pflname.sendKeys(sname);;
	}

	public void setPfemail(String semail) 
	{
		pfemail.click();
		pfemail.clear();
		pfemail.sendKeys(semail);
	}

	public void setPfpword(String spword) 
	{	
		pfpword.click();
		pfpword.clear();
		pfpword.sendKeys(spword);
	}

	public void setPfcheckbox()
	{
		pfcheckbox.click();
	}

	public void setPfsignup() 
	{
		pfsignup.click();
	}

	public void setPfsignin() 
	{
		pfsignin.click();
	}

	public void setPfuname(String suname) 
	{
		pfuname.clear();
		pfuname.sendKeys(suname);
	}

	public void setPfpassword(String spassword) 
	{
		pfpassword.clear();
		pfpassword.sendKeys(spassword);
	}

	public void setPfsin() 
	{
		pfsin.click();
	}

	public void setPffpswd() 
	{
		pffpswd.click();
	}

	public void setPfEnterurmail(String sEnterurmail) 
	{
		pfEnterurmail.sendKeys(sEnterurmail);;
	}

	public void setPfresetpass() 
	{
		pfresetpass.click();
	}

	// Getters
	public WebElement getPfmenu() {
		return pfmenu;
	}

	public WebElement getPfSubscribe() {
		return pfSubscribe;
	}

	public WebElement getPfplatinum() {
		return pfplatinum;
	}

	public WebElement getPffname() {
		return pffname;
	}

	public WebElement getPflname() {
		return pflname;
	}

	public WebElement getPfemail() {
		return pfemail;
	}

	public WebElement getPfpword() {
		return pfpword;
	}

	public WebElement getPfcheckbox() {
		return pfcheckbox;
	}

	public WebElement getPfsignup() {
		return pfsignup;
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
