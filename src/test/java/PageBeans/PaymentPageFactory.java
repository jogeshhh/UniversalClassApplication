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
	
	@FindBy(xpath = "//button[contains(text(),'Browse Courses')]")
	@CacheLookup
	WebElement pfbrowsecourses;
	
	@FindBy(xpath = "//div[@id='FrontDropContent']")
	@CacheLookup
	WebElement pffrontdrop;
	
	@FindBy(xpath = "/html/body/div/div[6]/div/div[2]/div/div[3]/div[2]/div[3]/ul/li[2]/a")
	@CacheLookup
	WebElement pfselectcourse;
	
	@FindBy(css = "div.mainbody:nth-child(2) div.catbody div.crnlst17scroll:nth-child(7) div.crnlst17 ul:nth-child(1) li:nth-child(1) > a:nth-child(1)")
	@CacheLookup
	WebElement pfselectclass;
	
	@FindBy(xpath = "//input[@name='JoinClassButton1']")
	@CacheLookup
	WebElement pfjointhiscourse1;
	
	@FindBy(xpath = "//div[@class='viewhidebig']//div[1]//div[5]//a[1]")
	@CacheLookup
	WebElement pfaddtocart;
	
	@FindBy(xpath = "//input[@name='ContinueSubmit']")
	@CacheLookup
	WebElement pffinalcheckout;
	

	@FindBy(xpath = "//div[@class='paybox']")
	@CacheLookup
	WebElement pfpaybox;
	
	
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
	
	@FindBy(how=How.ID, using="ani")
	@CacheLookup
	WebElement pfphoneNo;
	
	@FindBy(how=How.ID, using="cctype")
	@CacheLookup
	WebElement pfcctype;

	@FindBy(how=How.ID, using="cc")
	@CacheLookup
	WebElement pfccnumber;
	
	@FindBy(how=How.ID, using="exp_month")
	@CacheLookup
	WebElement pfexpmonth;
	
	@FindBy(how=How.ID, using="exp_year")
	@CacheLookup
	WebElement pfexpyear;
	
	@FindBy(how=How.ID, using="sec")
	@CacheLookup
	WebElement pfcvv;
	
	@FindBy(xpath = "//input[@name='submitButton']")
	@CacheLookup
	WebElement pfcompleteppayment;
	
	@FindBy(xpath = "//div[@class='zoomIn errorscreen']")
	@CacheLookup
	WebElement pfpaymentfailmsg;

// Step 2 : Setters

	public void setPfmaindropdown() {
		pfmaindropdown.click();
	}


	public void setPfsigninoption() {
		this.pfsigninoption.click();;
	}


	public void setPfuname(String uname) {
		pfuname.clear();
		pfuname.sendKeys(uname);
	}


	public void setPfpwd(String pwd) {
		pfpwd.clear();
		pfpwd.sendKeys(pwd);
	}


	public void setPfsubmitbtn() {
		this.pfsubmitbtn.click();
	}


	public void setPfbrowsecourses() {
		this.pfbrowsecourses.click();
	}


	public void setPfselectcourse() {
		this.pfselectcourse.click();
	}


	public void setPffrontdrop() {
		pffrontdrop.click();
	}


	public void setPfselectclass() {
		this.pfselectclass.click();
	}


	public void setPfjointhiscourse1() {
		this.pfjointhiscourse1.click();
	}


	public void setPfaddtocart() {
		this.pfaddtocart.click();
	}


	public void setPffinalcheckout() {
		this.pffinalcheckout.click();
	}


	public void setPfpaybox() {
		this.pfpaybox.click();
	}


	public void setPffname(String sfname) {
		this.pffname.clear();
		this.pffname.sendKeys(sfname);
	}


	public void setPflname(String slname) {
		this.pflname.clear();
		this.pflname.sendKeys(slname);
	}


	public void setPfaddress(String saddress) {
		this.pfaddress.clear();
		this.pfaddress.sendKeys(saddress);
	}


	public void setPfcity(String scity) {
		this.pfcity.clear();
		this.pfcity.sendKeys(scity);
	}


	public void setPfzip(String zip) {
		this.pfzip.clear();
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


	public void setPfphoneNo(String sphoneNo) {
		pfphoneNo.clear();
		pfphoneNo.sendKeys(sphoneNo);
	}


	public void setPfcctype(String cctype) {
		Select drpCCtype = new Select(pfcctype);
		drpCCtype.selectByVisibleText(cctype);
	}

	public void setPfccnumber(String ccnumber) {
		pfccnumber.clear();
		pfccnumber.sendKeys(ccnumber); 
	}


	public void setPfexpmonth(String expmonth) {
		Select drpExpMonth = new Select(pfexpmonth);
		drpExpMonth.selectByVisibleText(expmonth);
	}


	public void setPfexpyear(String expyear) {
		Select drpExpYear = new Select(pfexpyear);
		drpExpYear.selectByVisibleText(expyear);
	}


	public void setPfcvv(String cvv) {
		this.pfcvv.clear();
		this.pfcvv.sendKeys(cvv);
	}


	public void setPfcompleteppayment() {
		this.pfcompleteppayment.click();
	}


	public void setPfpaymentfailmsg() {
		this.pfpaymentfailmsg.getText();
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


	public WebElement getPffrontdrop() {
		return pffrontdrop;
	}


	public WebElement getPfselectcourse() {
		return pfselectcourse;
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


	public WebElement getPfphoneNo() {
		return pfphoneNo;
	}


	public WebElement getPfcctype() {
		return pfcctype;
	}


	public WebElement getPfccnumber() {
		return pfccnumber;
	}


	public WebElement getPfexpmonth() {
		return pfexpmonth;
	}


	public WebElement getPfexpyear() {
		return pfexpyear;
	}


	public WebElement getPfcvv() {
		return pfcvv;
	}


	public WebElement getPfcompleteppayment() {
		return pfcompleteppayment;
	}


	public WebElement getPfpaymentfailmsg() {
		return pfpaymentfailmsg;
	}


	public PaymentPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
