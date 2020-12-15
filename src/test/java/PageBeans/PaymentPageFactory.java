package PageBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentPageFactory {
	WebDriver driver;
	
//Step1 : Identify elements
	@FindBy(className = "dropbtn")
	@CacheLookup
	WebElement pfmaindropdown;
	
	@FindBy(xpath="//div[@id='mnhdrlgnbx']//a[1]")
	@CacheLookup
	WebElement pfsigninoption;
	
	@FindBy(how=How.NAME, using="username")
	@CacheLookup
	WebElement pfuname;
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement pfpwd;
	
	@FindBy(how=How.NAME, using="SubmitButton")
	@CacheLookup
	WebElement pfsubmitbtn;
	
	@FindBy(xpath = "//button[contains(.,'Browse Courses')]")
	@CacheLookup
	WebElement pfbrowsecourses;
	
	@FindBy(css="li:nth-child(2) span")
	@CacheLookup
	WebElement pfselectcoure;
	
	@FindBy(xpath = "//img[@alt='Healing Affirmations']")
	@CacheLookup
	WebElement pfselectclass;
	
	@FindBy(how = How.NAME, using = "JoinClassButton1")
	@CacheLookup
	WebElement pfjointhiscourse1;
	
	@FindBy(linkText = "Add to Cart")
	@CacheLookup
	WebElement pfaddtocart;
	
	@FindBy(how = How.NAME, using = "ContinueSubmit")
	@CacheLookup
	WebElement pffinalcheckout;
	
	@FindBy(how=How.ID, using="first_name")
	@CacheLookup
	WebElement pffname;
	
	@FindBy(how=How.ID, using="last_name")
	@CacheLookup
	WebElement pflname;

	@FindBy(how=How.ID, using="address1")
	@CacheLookup
	WebElement pfaddress;

	@FindBy(how=How.ID, using="city")
	@CacheLookup
	WebElement pfcity;
	
	@FindBy(how=How.ID, using="zip")
	@CacheLookup
	WebElement pfzip;

	@FindBy(how=How.ID, using="country")
	@CacheLookup
	WebElement pfcountry;
	
	@FindBy(how=How.ID, using="state")
	@CacheLookup
	WebElement pfstate;
	
	@FindBy(how=How.ID, using="cctype")
	@CacheLookup
	WebElement pfcctype;
	
	@FindBy(how=How.ID, using="exp_month")
	@CacheLookup
	WebElement pfexpmonth;
	
	@FindBy(how=How.ID, using="exp_year")
	@CacheLookup
	WebElement pfexpyear;

// Step 2 : Setters

	public void setPfmaindropdown() {
		pfmaindropdown.click();
	}


	public void setPfsigninoption(WebElement pfsigninoption) {
		this.pfsigninoption.click();;
	}


	public void setPfuname(String uname) {
		pfuname.sendKeys(uname);
	}


	public void setPfpwd(String pwd) {
		pfpwd.sendKeys(pwd);
	}


	public void setPfsubmitbtn(WebElement pfsubmitbtn) {
		this.pfsubmitbtn.click();
	}


	public void setPfbrowsecourses(WebElement pfbrowsecourses) {
		this.pfbrowsecourses.click();
	}


	public void setPfselectcoure(WebElement pfselectcoure) {
		this.pfselectcoure.click();
	}


	public void setPfselectclass(WebElement pfselectclass) {
		this.pfselectclass.click();
	}


	public void setPfjointhiscourse1(WebElement pfjointhiscourse1) {
		this.pfjointhiscourse1.click();
	}


	public void setPfaddtocart(WebElement pfaddtocart) {
		this.pfaddtocart.click();
	}


	public void setPffinalcheckout(WebElement pffinalcheckout) {
		this.pffinalcheckout.click();
	}


	public void setPffname(String sfname) {
		this.pffname.sendKeys(sfname);
	}


	public void setPflname(String slname) {
		this.pflname.sendKeys(slname);
	}


	public void setPfaddress(String saddress) {
		this.pfaddress.sendKeys(saddress);
	}


	public void setPfcity(String scity) {
		this.pfcity.sendKeys(scity);
	}


	public void setPfzip(CharSequence[] zip) {
		this.pfzip.sendKeys(zip);
	}


	public void setPfcountry(String scountry) {
		Select drpCountry = new Select(pfcountry);
		drpCountry.selectByVisibleText(scountry);
	}


	public void setPfstate(String sstate) {
		Select drpState = new Select(pfstate);
		drpState.selectByVisibleText(sstate);
	}


	public void setPfcctype(String cctype) {
		Select drpCCtype = new Select(pfcctype);
		drpCCtype.selectByVisibleText(cctype);
	}


	public void setPfexpmonth(String expmonth) {
		Select drpExpMonth = new Select(pfexpmonth);
		drpExpMonth.selectByVisibleText(expmonth);
	}


	public void setPfexpyear(String expyear) {
		Select drpExpYear = new Select(pfexpyear);
		drpExpYear.selectByVisibleText(expyear);
	}

// Getters
	

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getPfmaindropdown() {
		return pfmaindropdown;
	}


	public WebElement getPfsigninoption() {
		return pfsigninoption;
	}


	public WebElement getPfuname() {
		return pfuname;
	}


	public WebElement getPfpwd() {
		return pfpwd;
	}


	public WebElement getPfsubmitbtn() {
		return pfsubmitbtn;
	}


	public WebElement getPfbrowsecourses() {
		return pfbrowsecourses;
	}


	public WebElement getPfselectcoure() {
		return pfselectcoure;
	}


	public WebElement getPfselectclass() {
		return pfselectclass;
	}


	public WebElement getPfjointhiscourse1() {
		return pfjointhiscourse1;
	}


	public WebElement getPfaddtocart() {
		return pfaddtocart;
	}


	public WebElement getPffinalcheckout() {
		return pffinalcheckout;
	}


	public WebElement getPffname() {
		return pffname;
	}


	public WebElement getPflname() {
		return pflname;
	}


	public WebElement getPfaddress() {
		return pfaddress;
	}


	public WebElement getPfcity() {
		return pfcity;
	}


	public WebElement getPfzip() {
		return pfzip;
	}


	public WebElement getPfcountry() {
		return pfcountry;
	}


	public WebElement getPfstate() {
		return pfstate;
	}


	public WebElement getPfcctype() {
		return pfcctype;
	}


	public WebElement getPfexpmonth() {
		return pfexpmonth;
	}


	public WebElement getPfexpyear() {
		return pfexpyear;
	}


	public void HotelBookingPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
