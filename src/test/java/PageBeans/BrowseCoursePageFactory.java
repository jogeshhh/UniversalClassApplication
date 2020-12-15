package PageBeans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BrowseCoursePageFactory {	WebDriver driver;

//Step1 : Identify elements
	@FindBy(how=How.ID, using="SearchString")
	@CacheLookup
	WebElement pfsearchbox;
	
	@FindBy(css="#searchicon > img")
	@CacheLookup
	WebElement pfsearchbtn;
	
	@FindBy(className = "zoomIn")
	@CacheLookup
	WebElement pfsearchresult;

//Step 2 : Setters
	public void setPfsearchbox(String course) {
		this.pfsearchbox.sendKeys(course);
	}

	public void setPfsearchbtn(WebElement pfsearchbtn) {
		this.pfsearchbtn.click();
	}

	public void setPfsearchresult(WebElement pfsearchresult) {
		this.pfsearchresult.getText();
		// use assert cmd to verify that invalidity
	}

//Step 3 : Getters

	public WebElement getPfsearchbox() {
		return pfsearchbox;
	}

	public WebElement getPfsearchbtn() {
		return pfsearchbtn;
	}

	public WebElement getPfsearchresult() {
		return pfsearchresult;
	}
		
}

