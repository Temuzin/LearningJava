package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kcdc1\\OneDrive\\Desktop\\Selenium testing lessons\\Workspace\\LearningJava\\browserdrivers\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get("https://www.xe.com/");
	

		driver.findElement(By.id("amount")).sendKeys("100.00");
	Thread.sleep(5000);	
	System.out.println(" The amount is $" + driver.findElement(By.id("amount")).getAttribute("value"));
			driver.quit();
			 
			 
		/*
Select Currency = new Select(driver.findElement(By.id("midmarketFromCurrency")));
Currency.selectByVisibleText("Euro");
	*/
	
		
		
	}

}
