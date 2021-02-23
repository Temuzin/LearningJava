package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyPratice3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe. ");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.linkText("28")).click();
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.linkText("30")).click();
		
		

		
		
		
		
		
		
		
		
	

		
	}

}
