package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.PythonExcelReader;

public class StackPage {
	
	
	WebDriver driver;
	PythonExcelReader excel = new PythonExcelReader();
	By python_editor =By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[@type='button']");
	By output = By.xpath("//pre[@id='output']");
	By getstarted = By.xpath("//a[@href='stack']");
	By operations = By.xpath("//a[contains(text(),'Operations in Stack')]");
	By tryhere = By.xpath("//a[@class='btn btn-info']");
	By implementation = By.xpath("//a[contains(text(),'Implementation')]");
	By application = By.xpath("//a[contains(text(),'Applications')]");
	
	
	public StackPage(WebDriver driver) {
		this.driver = driver;
	}

	public void getStarted() {
		driver.findElement(getstarted).click();
	}
	
	public void operationInStack() {
		
		driver.navigate().to("https://dsportalapp.herokuapp.com/stack/");
		driver.findElement(operations).click();
	}

		public void clickTryHere() {
			driver.findElement(tryhere).click();
		}
		
		public void clickOnImplementation() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/stack/");
			driver.findElement(implementation).click();
		}
		
		public void clickOnApplication() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/stack/");
			driver.findElement(application).click();
		}
	
		
		public void pythonEditor() throws IOException {
				
				WebElement try_editor_clear=driver.findElement(python_editor);
				String[] list = excel.fileReader()	;
				Actions actions= new Actions(driver);
				actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
				driver.findElement(python_editor).sendKeys(list[0]);
				driver.findElement(run).click();
				System.out.println("Output is :"+driver.findElement(output).getText());
				
				actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
				driver.findElement(python_editor).sendKeys(list[1]);
				driver.findElement(run).click();
				System.out.println("Alert is :"+driver.switchTo().alert().getText() );
				driver.switchTo().alert().accept();
					
					
				}


}
