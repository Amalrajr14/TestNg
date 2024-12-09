package testngScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment extends Base {
//	@Test
//	public void checkBox() {
//		driver.navigate().to("https://demoqa.com/checkbox");
//		WebElement check= driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
//		check.click();	
//	}
//	
//	@Test
//	public void radioButton() {
//		driver.navigate().to("https://demoqa.com/radio-button");
//		WebElement radio= driver.findElement(By.xpath("//label[@for='yesRadio']"));
//		radio.click();	
//	}
//	@Test
//	public void editIcon() {
//		driver.navigate().to("https://demoqa.com/webtables");
//		WebElement edit= driver.findElement(By.xpath("//span[@id='edit-record-1']"));
//		edit.click();	
//	}
//	@Test
//	public void buttonClick() {
//		driver.navigate().to("https://demoqa.com/buttons");
//		WebElement twoclick= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//		Actions actions = new Actions(driver);
//		actions.doubleClick(twoclick).build().perform();		
//	}
//	@Test
//	public void links() {
//		driver.navigate().to("https://demoqa.com/links");
//		WebElement link= driver.findElement(By.xpath("//a[@id='simpleLink']"));
//		link.click();		
//	}
	
	@Test
	public void practiceForm() throws AWTException  {
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement name= driver.findElement(By.xpath("//input[@id='firstName']"));
		js.executeScript("arguments[0].value='Amal';",name);
		WebElement lname= driver.findElement(By.xpath("//input[@id='lastName']"));
		js.executeScript("arguments[0].value='Raj';",lname);
		WebElement email= driver.findElement(By.xpath("//input[@id='userEmail']"));
		js.executeScript("arguments[0].value='amalraj@gmail.com';",email);
		WebElement gender= driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		js.executeScript("arguments[0].click();",gender);
		WebElement mobile= driver.findElement(By.xpath("//input[@id='userNumber']"));
		js.executeScript("arguments[0].value='1234567891';",mobile);
		WebElement birth= driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		js.executeScript("arguments[0].click();",birth);
		WebElement month= driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select select = new Select(month);
		select.selectByVisibleText("April");
		WebElement year= driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select selectyear = new Select(year);
		selectyear.selectByVisibleText("1995");
		WebElement day= driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--025']"));
		day.click();
		WebElement subj= driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		js.executeScript("arguments[0].click();",subj);
		subj.sendKeys("Physics");
		subj.sendKeys(Keys.ENTER);
		WebElement hobbie= driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
		js.executeScript("arguments[0].click();",hobbie);
		WebElement selectFile=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		js.executeScript("arguments[0].click();",selectFile);
		StringSelection selects =new StringSelection("C:\\Users\\dell\\Downloads\\wp3990002-sachin-tendulkar-wallpapers.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selects,null);
		Robot r = new Robot();
		r.delay(500);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.delay(500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement addres= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		js.executeScript("arguments[0].value='Address';",addres);
		WebElement state= driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
		js.executeScript("arguments[0].click();",state);
		state.sendKeys("NCR");
		state.sendKeys(Keys.ENTER);
		WebElement city= driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		js.executeScript("arguments[0].click();",city);
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ENTER);
		
		WebElement submit= driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].click();",submit);
		
			
	}
//	@Test
//	public void selectSubject() {
//		
//		driver.navigate().to("https://demoqa.com/automation-practice-form");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement subj= driver.findElement(By.xpath("//input[@id='subjectsInput']"));
//		js.executeScript("arguments[0].click();",subj);
//		subj.sendKeys("Physics");
//		subj.sendKeys(Keys.ENTER);
//		
//		
//		
//	}
//	@Test
//public void practiceformCont() throws AWTException {
//		driver.navigate().to("https://demoqa.com/automation-practice-form");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	WebElement hobbie= driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
//	js.executeScript("arguments[0].click();",hobbie);
//	WebElement selectFile=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
//	js.executeScript("arguments[0].click();",selectFile);
//	StringSelection select =new StringSelection("C:\\Users\\dell\\Downloads\\wp3990002-sachin-tendulkar-wallpapers.jpg");
//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
//	Robot r = new Robot();
//	r.delay(250);
//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_V);
//	r.keyRelease(KeyEvent.VK_CONTROL);
//	r.keyRelease(KeyEvent.VK_V);
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
//	
//	
//}
//	@Test
//	public void practiveformThird() {
//		
//		driver.navigate().to("https://demoqa.com/automation-practice-form");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement addres= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
//		js.executeScript("arguments[0].value='Address';",addres);
//		WebElement state= driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
//		js.executeScript("arguments[0].click();",state);
//		state.sendKeys("NCR");
//		state.sendKeys(Keys.ENTER);
//		WebElement city= driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
//		js.executeScript("arguments[0].click();",city);
//		city.sendKeys("Delhi");
//		city.sendKeys(Keys.ENTER);
//		
//		WebElement submit= driver.findElement(By.xpath("//button[@id='submit']"));
//		js.executeScript("arguments[0].click();",submit);
//		
//		
//	}


}
