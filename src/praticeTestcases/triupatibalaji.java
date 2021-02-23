package praticeTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class triupatibalaji {
	//if else.. dropdownhandle

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kcdc1\\OneDrive\\Desktop\\Selenium testing lessons\\Workspace\\LearningJava\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http:tirupatibalaji.ap.gov.in/#/registration");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("fName")).sendKeys("Ram");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("lName")).sendKeys("Parsad");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("mobNo")).sendKeys("9876543210");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='regdob']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select Month = new Select(driver.findElement(By.xpath("//select[@title='Change the month']")));
		Month.selectByVisibleText("July");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select Year = new Select(driver.findElement(By.xpath("//select[@title='Change the year']")));
		Year.selectByVisibleText("2001");
		driver.findElement(By.linkText("17")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click(); //select gender
		
//		Select Country = new Select(driver.findElement(By.name("countryS")));
//		Country.selectByVisibleText("India");
//		// driver.findElement(By.name("stateS")).sendKeys("Goa");
//		Select State = new Select(driver.findElement(By.name("stateS")));
//		State.selectByVisibleText("Goa");
		
		//Select Country =  new  Select( driver.findElement(By.name("countryS")));
		//Country.selectByVisibleText("Nepal");
		
		Select Country =  new  Select( driver.findElement(By.name("countryS")));
		Country.selectByVisibleText("India");
		
		if (driver.findElement(By.xpath("//*[contains(@name,'state')]")).getTagName().equals("select")) {
			Select State = new Select(driver.findElement(By.xpath("//*[contains(@name,'state')]")));
			State.selectByVisibleText("Bihar");
			System.out.println("if condition met");
		} else {
			driver.findElement(By.xpath("//*[contains(@name,'state')]")).sendKeys("Type State");
			System.out.println("else condition met");
			driver.close();

		}
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
