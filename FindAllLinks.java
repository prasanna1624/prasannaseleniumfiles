package Viyaan;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/MAGULURI/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String browserUrl="http://techlistic.com/";
		driver.get(browserUrl);
		driver.manage().window().maximize();
	List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
 for (int i = 0; i<links.size(); i++)
		  {
		System.out.println(links.get(i).getText());
		  
          }
	}

}
