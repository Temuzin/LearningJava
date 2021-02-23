package webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyPratice6 {

	

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kcdc1\\OneDrive\\Desktop\\Selenium testing lessons\\Workspace\\LearningJava\\browserdrivers\\chromedriver.exe ");
		driver = new ChromeDriver();
		String[] names = {"Cucumber", "Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> products  = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i=0; i< products.size(); i++) {
			
			String name = products.get(i).getText();
			
			if (name.contains("cucumber")) {
				
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		
		 
	
		 
		

	}

}
