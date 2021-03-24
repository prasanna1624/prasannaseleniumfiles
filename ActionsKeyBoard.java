package Viyaan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/MAGULURI/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String browserUrl="https://www.techlistic.com/p/selenium-practice-form.html";
		driver.get(browserUrl);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement FIRSTNAME=driver.findElement(By.name("firstname"));
	Actions a=new Actions(driver);
	a.keyDown(Keys.SHIFT).sendKeys(FIRSTNAME, "prasanna").keyUp(Keys.SHIFT).build().perform();

	}
}
