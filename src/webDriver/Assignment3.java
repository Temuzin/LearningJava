package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe ");
driver = new ChromeDriver();
driver.get("http://spicejet.com");
/*
Select departure = new Select (driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
departure.selectByVisibleText("ATQ");

Select arrival = new Select (driver.findElement(By.name("ctl00$mainContent$ddl_destinationStation1")));
arrival.selectByVisibleText("");
*/

//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("ATQ");
//driver.findElement(By.name("ctl00$mainContent$ddl_destinationStation1")).sendKeys("DEL");

Select dollar = new Select (driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
dollar.selectByVisibleText("USD");




	
	}

	
	}


