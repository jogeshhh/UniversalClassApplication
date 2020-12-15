package PageBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SubscribePageFactory {
WebDriver driver;
	
	//Step 1 : locating the elements
	@FindBy(how=How.ID, using= "clssicon")
	@CacheLookup
	WebElement pfmenu;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement pfSubscribe;
	
	@FindBy(xpath=" //body/div[@id='mainco")
	@CacheLookup
	WebElement pfplatinum;
	
	@FindBy(how=How.NAME, using="givenname")
	@CacheLookup
	WebElement pffname;
	
	@FindBy(how=How.NAME, using="sn")
	@CacheLookup
	WebElement pflname;
	
	@FindBy(xpath = "//input[@id='mail']")
	@CacheLookup
	WebElement pfemail;
	
	@FindBy(how=How.NAME, using="userpassword")
	@CacheLookup
	WebElement pfpword;
	
	@FindBy(xpath = "//body/div[@id='maincontainer']/div[@id='myPopUp']/div[@id='PopUpContent']/div[@id='popbdy']/div[1]/form[1]/div[5]/input[1]")
	@CacheLookup
	WebElement pfcheckbox;
	
	@FindBy(how = How.NAME, using = "SignUpButton")
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
	public void setPfmenu(WebElement pfmenu) 
	{
		pfmenu.click();
		
	}

	public void setPfSubscribe(WebElement pfSubscribe) 
	{
		pfSubscribe.click();
	}

	public void setPfplatinum(WebElement pfplatinum) 
	{
		pfplatinum.click();
	}

	public void setPffname(String fname) 
	{
		pffname.sendKeys(fname);
	}

	public void setPflname(String lname) 
	{
		pflname.sendKeys(lname);;
	}

	public void setPfemail(String email) 
	{
		pfemail.sendKeys(email);
	}

	public void setPfpword(String pword) 
	{
		pfpword.sendKeys(pword);
	}

	public void setPfcheckbox(WebElement pfcheckbox)
	{
		pfcheckbox.click();
	}

	public void setPfsignup(WebElement pfsignup) 
	{
		pfsignup.click();
	}

	public void setPfsignin(WebElement pfsignin) 
	{
		pfsignin.click();
	}

	public void setPfuname(String uname) 
	{
		pfuname.sendKeys(uname);
	}

	public void setPfpassword(String password) {
		pfpassword.sendKeys(password);
	}

	public void setPfsin(WebElement pfsin) {
		pfsin.click();
	}

	public void setPffpswd(WebElement pffpswd) {
		pffpswd.click();
	}

	public void setPfEnterurmail(String Enterurmail) {
		pfEnterurmail.sendKeys(Enterurmail);;
	}

	public void setPfresetpass(WebElement pfresetpass) {
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
