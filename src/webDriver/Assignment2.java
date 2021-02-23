package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kcdc1\\OneDrive\\Desktop\\Selenium testing lessons\\Workspace\\LearningJava\\browserdrivers\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get("http://tirupatibalaji.ap.gov.in/#/registration");
		// add info
		Thread.sleep(5000);
		driver.findElement(By.name("fName")).sendKeys("John");
		driver.findElement(By.name("lName")).sendKeys("Doe");
		driver.findElement(By.id("indiMobile")).sendKeys("9876543210");
		driver.findElement(By.name("address1")).sendKeys("Rastapati Bhavan, ND");
		driver.findElement(By.name("address2")).sendKeys("Presidents House");
		driver.findElement(By.name("cityS")).sendKeys("New Delhi");

		// driver.findElement(By.name("countryS")).sendKeys("India");
		Select Country = new Select(driver.findElement(By.name("countryS")));
		Country.selectByVisibleText("India");
		// driver.findElement(By.name("stateS")).sendKeys("Goa");
		Select State = new Select(driver.findElement(By.name("stateS")));
		State.selectByVisibleText("Goa");
		driver.findElement(By.name("zipCode")).sendKeys("123345");
		// driver.findElement(By.name("proofS")).sendKeys("Passport");
		Select Proof = new Select(driver.findElement(By.name("proofS")));
		Proof.selectByVisibleText("Passport");

		driver.findElement(By.name("proofId")).sendKeys("A123456");
		driver.findElement(By.name("emailId")).sendKeys("xand@typery.com");
		driver.findElement(By.name("password")).sendKeys("Pass1234*");
		driver.findElement(By.name("repassword")).sendKeys("Pass1234*");
		driver.findElement(By.id("regi_continue")).click();

		// driver.close();

	}

}
