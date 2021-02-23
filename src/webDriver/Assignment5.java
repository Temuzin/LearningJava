package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5 {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kcdc1\\OneDrive\\Desktop\\Selenium testing lessons\\Workspace\\LearningJava\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		driver.findElement(By.id("confirmButton")).click();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.id("confirmResult")).getText());

		//driver.quit();
		Thread.sleep(5000);
		// First Click me
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Second Click me: After 5 sec, alert will come
		driver.findElement(By.id("timerAlertButton")).click();
		//Thread.sleep(8000);
		//explicit: her we have different methods to 
		//verify the attributes has present or displayed or cliked or enabled
		//Validate the alert has displayed or not?
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();

		// Thrird Click me

	}

}
