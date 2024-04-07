package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;

public class ApplicationHooks {
	
	private DriverFactory driverFactory ;
	private WebDriver driver;
	private ConfigReader config;
	Properties prop;
	
	@Before (order=0)
	public void getProperty() throws IOException {
		
		config = new ConfigReader();
		prop = config.init_prop();
	}
		@Before(order=1)
		public void launchBrowser()
	{
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
	}
	@After (order=0)
	public void tearDown() {
		driver.quit();
	}
	@After (order=1)
	public void takeScreenshot(Scenario sc ) { 
			if(sc.isFailed())
		{
			String screenshotname = sc.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			
			sc.attach(sourcePath, "image/png", screenshotname);
		}
		
		
	}
	
	
	
	
	
	

}
