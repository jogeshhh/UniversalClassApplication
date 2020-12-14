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

	//step 2 : Setters
	public void pfmaindropdown(String sfname) {
		pfmaindropdown.sendKeys(sfname);
	}

	public void pfsigninoption() {
		pfsigninoption.click();
	}

	public void pfuname(String slname) {
		pfuname.sendKeys(slname);
	}

	public void pfpwd(String semail) {
		pfpwd.sendKeys(semail);
	}

	public void pfsubmitbtn(String smobile) {
		pfsubmitbtn.sendKeys(smobile);
	}

	public void pfbrowsecourses() {
		pfbrowsecourses.click();
	}

	public void pfselectcoure() {
		pfselectcoure.click();
	}

	public void pfselectclass() {
		pfselectclass.click();
	}
	

	public void pfjointhiscourse1() {
		pfjointhiscourse1.click();
	}

	public void pfaddtocart() {
		pfaddtocart.click();
	}

	public void pffinalcheckout() {
		pffinalcheckout.click();
	}

	public void pffname(String fname) {
		pffname.sendKeys(fname);
	}

	public void pflname(String lname) {
		pflname.sendKeys(lname);
	}

	public void pfaddress(String address) {
		pfaddress.sendKeys(address);
	}

	public void pfcity(String city) {
		pfcity.sendKeys(city);
	}

	public void pfzip(CharSequence[] zip) {
		pfzip.sendKeys(zip);
	}

	public void pfcountry(String country) {
		pfcountry.sendKeys(country);
	}

	public void pfstate(String state) {
		pfstate.sendKeys(state);
	}

	public void pfcctype(String cctype) {
		pfcctype.sendKeys(cctype);
	}
	
	public void pfexpmonth(CharSequence[] month) {
		pfexpmonth.sendKeys(month);
	}

	public void pfexpyear(CharSequence year) {
		pfexpyear.sendKeys(year);
	}
	
//getters
	public WebElement getPffname() {
		return pffname;
	}

	public WebElement getPfbutton() {
		return getPfbutton();
	}

	public WebElement getPflname() {
		return pflname;
	}

	public WebElement getPfemail() {
		return getPfemail();
	}

	public WebElement getPfmobile() {
		return pfmobile;
	}

	public WebElement getPfcity() {
		return pfcity;
	}

	public WebElement getPfstate() {
		return pfstate;
	}

	public int getPfpersons() {
		return pfpersons;
	}

	public WebElement getPfrooms() {
		return pfrooms;
	}

	public WebElement getPfcardholder() {
		return pfcardholder;
	}

	public WebElement getPfdebit() {
		return pfdebit;
	}

	public WebElement getPfcvv() {
		return pfcvv;
	}

	public WebElement getPfmonth() {
		return pfmonth;
	}

	public WebElement getPfyear() {
		return pfyear;
	}

	
	//initiating Elements
	public HotelBookingPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



}
