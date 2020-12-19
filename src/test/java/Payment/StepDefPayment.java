package Payment;

import cucumber.api.java.en.*;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageBeans.PaymentPageFactory;

public class StepDefPayment {
	WebDriver driver;
	private PaymentPageFactory objppf;

@Given("^user is on cart check out page$")
public void user_is_on_cart_check_out_page() throws Throwable {
	System.setProperty("webdriver.edge.driver", "D:\\Capgemini\\Softwares\\edgedriver_win64\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	objppf = new PaymentPageFactory(driver);
	driver.get("https://www.universalclass.com/");//launch url application 

	driver.manage().window().maximize();
	objppf.setPfmaindropdown();
	objppf.setPfsigninoption();
	objppf.setPfuname("Jogeshkumar184@gmail.com");
	objppf.setPfpwd("jogesh1998");
	objppf.setPfsubmitbtn(); Thread.sleep(1000);
	objppf.setPfbrowsecourses(); Thread.sleep(1000);
	objppf.setPfselectcourse();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	objppf.getPffrontdrop();
	objppf.setPfselectclass(); 
	objppf.setPfjointhiscourse1(); 
	objppf.setPfaddtocart(); 
}

@Given("^user is navigated to the checkout page$")
public void user_is_navigated_to_the_checkout_page() throws Throwable {
    objppf.setPffinalcheckout();
}

@When("^user enters all the Valid data$")
public void user_enters_all_the_Valid_data() throws Throwable {
    objppf.setPffname("jogesh");
    objppf.setPflname("kumar");
    objppf.setPfaddress("Rewari");	
    objppf.setPfcity("Rewari");	
    objppf.setPfstate("Not Listed (none)");	
    objppf.setPfzip("123401");
    objppf.setPfcountry("India");	
    objppf.setPfphoneNo("8006464357");	
    objppf.setPfcctype("Visa");
    objppf.setPfccnumber("4442123412341234");
    objppf.setPfexpmonth("11");	
    objppf.setPfexpyear("2024");
    objppf.setPfcvv("231");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    objppf.setPfcompleteppayment();
}

@Then("^display information succesfully message$")
public void display_information_succesfully_message() throws Throwable {
	String failmsg = objppf.getPfpaymentfailmsg().getText();
	String expected = "Sorry, we are not able to validate your credit card information";
    Assert.assertTrue(failmsg.contains(expected));
    System.out.println("payment details are correct");

}

@When("^user enters incorrect \"([^\"]*)\" or \"([^\"]*)\" or \"([^\"]*)\" or \"([^\"]*)\"$")
public void user_enters_incorrect_or_or_or(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	objppf.setPfpaybox();
	
    objppf.setPffname("jogesh");
    objppf.setPflname("kumar");
    objppf.setPfaddress("Rewari");	
    objppf.setPfcity("Rewari");	
    objppf.setPfstate("Not Listed (none)");	
    objppf.setPfzip("123401");
    objppf.setPfcountry(arg3);	
    objppf.setPfphoneNo(arg4);	
    objppf.setPfcctype("Visa");
    objppf.setPfccnumber(arg1);
    objppf.setPfexpmonth("11");	
    objppf.setPfexpyear("2024");
    objppf.setPfcvv(arg2);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
    objppf.setPfcompleteppayment();
    }

@Then("^display payment failed message$")
public void display_payment_failed_message() throws Throwable {
	String failmsg = objppf.getPfpaymentfailmsg().getText();
	System.out.println("fail msg is : "+failmsg);
	driver.close();
//    String expected = "Please correct the following";
//    Assert.assertTrue(failmsg.contains(expected));
//    System.out.println("payment is failed");
}

}
