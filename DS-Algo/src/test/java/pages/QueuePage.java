package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.PythonExcelReader;

public class QueuePage {
	
	WebDriver driver;
	PythonExcelReader excel = new PythonExcelReader();
	By python_editor =By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[@type='button']");
	By output = By.xpath("//pre[@id='output']");
	By tryhere = By.xpath("//a[@class='btn btn-info']");
	By getstarted = By.xpath("//a[@href='queue']");
	By implementationofqueue = By.xpath(" //a[@href='implementation-lists']");
	By dequeue = By.xpath("//a[@href='implementation-collections']");
	By array = By.xpath("//a[contains(text(),'Implementation using array')]");
	By queueOperations =By.xpath("//a[contains(text(),'Queue Operations')]");
	
	public QueuePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
		public void getStarted() {
			driver.findElement(getstarted).click();
		}

	
		public void implementationOfQueue() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/queue/");
			driver.findElement(implementationofqueue).click();
			
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
		
		public void tryHere() {
			driver.findElement(tryhere).click();
		}
		
		public void Queuedequeue() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/queue/");
			driver.findElement(dequeue).click();
		}
		
		public void implementationUsingArray() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/queue/");
			driver.findElement(array).click();
		}
		
		public void queueOperations() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/queue/");
			driver.findElement(queueOperations).click();
		}

}
