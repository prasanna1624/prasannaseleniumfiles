package Viyaan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:/Users/MAGULURI/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String browserUrl="https://www.techlistic.com/p/selenium-practice-form.html";
	driver.get(browserUrl);
	String FirstName="veda";
	driver.manage().window().maximize();
	
	WebElement FIRST_NAME_FIELD = driver.findElement(By.name("firstname"));
	WebElement RADIO_BUTTON = driver.findElement(By.id("sex-1"));
	WebElement PROFESSION = driver.findElement(By.name("profession"));
	WebElement SUBMIT_BUTTON = driver.findElement(By.name("submit"));
	
	FIRST_NAME_FIELD.sendKeys(FirstName);
	RADIO_BUTTON.click();
	PROFESSION.click();
	SUBMIT_BUTTON.click();
	driver.close();
	driver.quit();
	
	
	}

}
