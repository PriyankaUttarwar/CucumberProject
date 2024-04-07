package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.PythonExcelReader;

public class DataStructuresPage {

	WebDriver driver ;
	By signin= By.linkText("Sign in");
	By username = By.xpath("//input[@id='id_username']");
	By password = By.xpath("//input[@id='id_password']");
	By login = By.xpath("//input[@value='Login']");
	By message= By.xpath("//div[@role='alert']");
	By getStarted = By.xpath("//a[@href='data-structures-introduction']")  ;
	By timecomplexity =By.xpath("//a[@href='time-complexity']");
	By tryhere =By.xpath("//a[@href='/tryEditor']");
	By python_editor =By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	//WebElement try_editor_clear=driver.findElement(python_editor);
	By run = By.xpath("//button[@type='button']");
	By output = By.xpath("//pre[@id='output']");
	PythonExcelReader excel = new PythonExcelReader();
	
	
	
	public DataStructuresPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
public void homePage() {
		
		driver.get("https://dsportalapp.herokuapp.com/home");
	}
	
	public void cicksOnSignin() {
		
		driver.findElement(signin).click();
	}
	
	public void enterUsernameAndPassword(String username1, String password1) {
		
		driver.findElement(username).sendKeys(username1);
		driver.findElement(password).sendKeys(password1);
		driver.findElement(login).click();
	}
	
public String getMessage() {
		
		String value = driver.findElement(message).getText();
		return value;
	}
	
	public void clickOnGetStarted() {
		
		driver.findElement(getStarted).click();
	}

	
	public void clickOnTimeComplexity() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/");
		
		driver.findElement(timecomplexity).click();
	}
	
	public void clickOnTryHere() {
		
		driver.findElement(tryhere).click();
	}
	public void pythonEditor() throws IOException {
		
		WebElement try_editor_clear=driver.findElement(python_editor);
		String[] list = excel.fileReader()	;
		driver.findElement(python_editor).sendKeys(list[0]);
		driver.findElement(run).click();
		System.out.println("Output is :"+driver.findElement(output).getText());
		Actions actions = new Actions(driver);
		actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
		driver.findElement(python_editor).sendKeys(list[1]);
		driver.findElement(run).click();
		System.out.println("Alert is :"+driver.switchTo().alert().getText() );
		driver.switchTo().alert().accept();
			
			
		}
	
	
}
