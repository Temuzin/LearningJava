package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyPratice4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe. ");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[class*='signin']")).click();
		driver.findElement(By.cssSelector("input[type*='text']")).sendKeys("abc123");
		driver.findElement(By.xpath(" //input[@name='passwd']")).sendKeys("123pass");
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        
        		
		
		
		
	}

}
