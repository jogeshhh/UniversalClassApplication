package ForgotPassword;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions (plugin = {"pretty"}
					,monochrome = true)

public class TestRunnerForgotPassword {
    private TestNGCucumberRunner testNGCucumberRunner;
  
    @Test(dataProvider = "features")    
    public void feature(PickleEventWrapper eventwrapper,CucumberFeatureWrapper cucumberFeature) throws Throwable {
    	//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    	testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
    }   
    
    @DataProvider//(parallel=true)
    public Object[][] features() {
    	 if(testNGCucumberRunner == null){
    	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    	    }
    	    return testNGCucumberRunner.provideScenarios();
    }
    
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {    	
        testNGCucumberRunner.finish();        
    }
}