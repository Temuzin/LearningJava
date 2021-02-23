package praticeTestcases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class TestSheet001 {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		driver.manage().window().maximize();
		//TC_001
		System.out.println("TS_001**********TS_001");
		System.out.println("Is able to Automate? Yes.");
		System.out.println("****************************");
		
		//TC_002
		driver.findElement(By.id("imgbtnSubmit")).click();
		driver.findElement(By.className("errormsg")).getText();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("signup_name")).sendKeys("john");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("signup_mobileno")).getText();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("signup_mobileno")).sendKeys("987654");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("signup_email")).getText();
		driver.findElement(By.name("signup_email")).sendKeys("email@123.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("signup_password")).getText();
		driver.findElement(By.name("signup_password")).sendKeys("pass123");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//File Testcase = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(Testcase, new File(".Workspace\\Selenium_Automation\\screenshots\\Test001.PNG"));

		Thread.sleep(10000);
		System.out.println("TC_002 Automate Complete");
		System.out.println("*************");
		driver.close();
		
		
		

	}

}
