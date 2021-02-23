package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UdemyDropdownloop {

	public static void main(String[] args) {
		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kcdc1\\OneDrive\\Desktop\\Selenium testing lessons\\Workspace\\LearningJava\\browserdrivers\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Select Money = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		Money.selectByVisibleText("USD");
		System.out.println(Money);
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());

		driver.findElement(By.id("divpaxinfo")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//	int i =1; // while loop
//		while (i<5); {
//			driver.findElement(By.id("hrefIncAdt")).click(); 
//			i++;
//			
//	}
		for (int i = 1; i < 5; i++) // for loop
		{
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='CCU']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@value='TRV'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_SeniorCitizenDiv']")).isSelected());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_SeniorCitizenDiv']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_SeniorCitizenDiv']")).isSelected());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		// driver.quit();

	}
}