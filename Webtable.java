package Viyaan;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/MAGULURI/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String browserUrl="https://www.techlistic.com/p/demo-selenium-practice.html";
		driver.get(browserUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement table=driver.findElement(By.className("tsc_table_s13"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		int Count=rows.size();
		System.out.println(Count);
		for(int i=0;i<Count;i++)
		{
			if(i==0)
			{
				List<WebElement> tableheader=  rows.get(i).findElements(By.tagName("th"));
				for(int j=0;j<tableheader.size();j++)
				{
					System.out.println(tableheader.get(j).getText());	
			}
			}
		
			else
			{
				List<WebElement> tabledata=rows.get(i).findElements(By.tagName("td"));
			for (int j=0;j<tabledata.size();j++)
			{
				System.out.println(tabledata.get(j).getText());
		
			}
			}
	}
}
}
