package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UdemyPratice1 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kcdc1\\OneDrive\\Desktop\\Selenium testing lessons\\Workspace\\LearningJava\\browserdrivers\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		driver.findElement(By.name("checkBoxOption1")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("checkBoxOption1")).click();

		System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());

	//System.out.println(driver.findElements(By.xpath("//input[type ='checkbox']")).size());
		System.out.println(driver.findElements(By.name("checkBoxOption1")).size());
		
	
		

		
		
	
		
		
		
	}

}
