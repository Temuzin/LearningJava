package newtojava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.DriverSessions;
import org.seleniumhq.jetty9.server.handler.ThreadLimitHandler;

public class tuto4 {

	public static void main(String[] args) {	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kcdc1\\OneDrive\\Desktop\\Selenium testing lessons\\Workspace\\LearningJava\\browserdrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://yahoo.com");
		/*
		//to check title
		System.out.println(driver.getTitle());
		// to check correct url
		System.out.println(driver.getCurrentUrl());
		//print page source
		System.out.println(driver.getPageSource());
		
		driver.get("http://yahoo.com");
		// google then yahoo and back to google again or vice versa
		driver.navigate().back();
		driver.navigate().forward();
		driver.close(); // closes current browser
		driver.quit(); //closes current browser opened by selenium
		*/
		
		
		
	}

	}


