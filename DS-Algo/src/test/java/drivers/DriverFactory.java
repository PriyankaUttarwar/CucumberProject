package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> threadlocaldriver = new ThreadLocal<>() ;
	ChromeOptions options = new ChromeOptions();
	
	public WebDriver init_driver(String browser) {
		
		System.out.println("Browser is : "+ browser);
		
		if(browser.equals("chrome")) {
			options.addArguments("headless");
			WebDriverManager.chromedriver().setup();
			threadlocaldriver.set(new ChromeDriver(options));
		}
		
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			threadlocaldriver.set(new FirefoxDriver());
		}
		
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			threadlocaldriver.set(new EdgeDriver());
		}
		
		else {
			
			System.out.println("Please enter the correct browser :"+browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		
		return getDriver();
	}
	
	
	
	public static WebDriver getDriver() {
		
		return threadlocaldriver.get();
	}

}
