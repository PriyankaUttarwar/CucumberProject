package testrunners;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import utilities.ConfigReader;

@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"stepdefinitions","hooks"},
		
		plugin={"pretty",
			    		  "html:target/report.html",
			    		  "json:target/report.json",
			    		  "junit:target/report.xml",
			    		  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
			    		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			    		 },
		publish = true
			
		)

//public class TestRunner2  extends AbstractTestNGCucumberTests{
//	
//	 @Override
//	    @DataProvider(parallel = true)
//	    public Object[][] scenarios() 
//	 	{
//	        return super.scenarios();
//	    }
//}

public class TestRunner2  extends AbstractTestNGCucumberTests{
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
}
