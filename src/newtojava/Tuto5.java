package newtojava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tuto5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kcdc1\\OneDrive\\Desktop\\Selenium testing lessons\\Workspace\\LearningJava\\browserdrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");

	}

}
