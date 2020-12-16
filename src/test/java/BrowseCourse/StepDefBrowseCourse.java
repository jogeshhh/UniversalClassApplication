package BrowseCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageBeans.BrowseCoursePageFactory;
import cucumber.api.java.en.*;

public class StepDefBrowseCourse 
{ 
	private WebDriver driver;
	private BrowseCoursePageFactory bcpf;

@Given("^User is on Universal homepage$")
public void user_is_on_Universal_homepage() throws Throwable {
	System.setProperty("webdriver.edge.driver", "D:\\Capgemini\\Softwares\\edgedriver_win64\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	bcpf = new BrowseCoursePageFactory(driver);
	driver.get("https://www.universalclass.com/");//launch url application 
}

@When("^User clicks in the search box$")
public void user_clicks_in_the_search_box() throws Throwable {
	 bcpf.getPfsearchbox().click();
}

@When("^user types a valid course name$")
public void user_types_a_valid_course_name() throws Throwable {
    bcpf.setPfsearchbox("Excel"); Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
}

@When("^user types a invalid course name$")
public void user_types_a_invalid_course_name() throws Throwable {
    bcpf.setPfsearchbox("asdasff"); Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
}

@When("^clicks the Find button$")
public void clicks_the_Find_button() throws Throwable {
	   bcpf.setPfsearchbtn();
}
//
//@Then("^check the error message displayed$")
//public void check_the_error_message_displayed() throws Throwable {
//    String searchresult = bcpf.setPfsearchresult();
//    Assert
//}
}
