package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyPraticeAlert {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kcdc1\\OneDrive\\Desktop\\Selenium testing lessons\\Workspace\\LearningJava\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("name")).sendKeys("Ram Prasad");
//		driver.findElement(By.id("alertbtn")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		
		
		driver.findElement(By.id("name")).sendKeys("Ram Prasad");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Cancel was choosen.");
		driver.quit();

				

	}

}
