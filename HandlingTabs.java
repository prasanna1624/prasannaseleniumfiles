package Viyaan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/MAGULURI/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String browserUrl="http://www.google.com";
		driver.get(browserUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		 driver.get("http://www.gmail.com");
		 driver.findElement(By.xpath("//a[contains(text(),'mail')]")).click();  
	      driver.findElement(By.id("identifierId")).sendKeys("WebDriver"); 
	      driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	      driver.findElement(By.id("Passwd")).sendKeys("WebDriver");  
	      driver.findElement(By.id("signIn")).click();  
	      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");  
	      driver.switchTo().defaultContent();
	      driver.findElement(By.id("gbqfq")).sendKeys("WebDriver"); 
	      driver.findElement(By.id("gbqfb")).click();  

	}

}
