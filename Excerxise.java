package Viyaan;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excerxise {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/MAGULURI/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.achieve3000.com";
		driver.get(url);
		driver.findElement(By.xpath("//*[@id='main-navbar']/div/div/div[6]/button")).click();
		driver.findElement(By.linkText("Partners")).click();
		
		
	List<WebElement> imgElements=driver.findElements(By.xpath("//div[@class='col-12 col-md-3 ft-img']/a/img"));
	for(WebElement ele:imgElements)
	{
		System.out.println(ele.getAttribute("src"));
	}
		
		int count=0;
for(int i=1;i<(imgElements.size()*2);i+=2)
{
	WebElement Logo=driver.findElement(By.xpath("//*[@id='fullpage']/div[2]/div[2]/div["+i+"]/div[1]/a/img"));
	WebElement Header=driver.findElement(By.xpath("//*[@id='fullpage']/div[2]/div[2]/div["+i+"]/div[2]/a/h3"));
	WebElement Description=driver.findElement(By.xpath("//*[@id='fullpage']/div[2]/div[2]/div["+i+"]/div[2]/div/p"));
	if(Logo.getAttribute("src")!=null) {
		if(Header.getText()!=null) {
			if(Description.getText()!=null)
			{
				count++;
			}
		}
	}
}
	if(count==imgElements.size())
	{
		System.out.println("Logo,Header,and Description are present for all partners");
	}
	else {
		throw new Exception("Logo,Header and Description are not present for all partners");
	}

	
		
		
	}

}
