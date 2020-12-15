package PageBeans;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

	public class SignInPageFactory 
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
		
		@FindBy(how=How.NAME, using="password")
		@CacheLookup
		WebElement pfpassword;
		
		@FindBy(how=How.NAME, using="SubmitButton")
		@CacheLookup
		WebElement pfsin;

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

		public void setPfpassword(String password) 
		{
			pfpassword.sendKeys(password);
		}

		public void setPfsin(WebElement pfsin) 
		{
			pfsin.click();
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

}
