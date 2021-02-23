package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		driver.findElement(By.id("jriTop_signin9")).click();
		driver.findElement(By.name("txtUserName")).sendKeys("user@email.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("pass1234");
		// driver.findElementByClsName("textfield-348x36 radius inputsbg");
		driver.findElement(By.className("pad0")).click();

		// driver.close();

	}

}
