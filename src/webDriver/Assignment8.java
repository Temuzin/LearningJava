package webDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment8 {
	public static int getRanNum;
	public static void RanRange (int min, int max) {
	Random r = new Random();
	getRanNum = r.nextInt(21);
	if (getRanNum==0) {
		getRanNum=1;
		
		
	}
	
	System.out.println("getRanNum is " + getRanNum);
	}

	public static void main(String[] args) {
		WebDriver driver;		
		System.setProperty("webdriver.edge.driver",".\\browserdrivers\\msedgedriver.exe");

		driver= new EdgeDriver();
		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='tgbgdpr-overlay-agree']")).click();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		RanRange(1,21);
		String xpath1 = "//*[@id=\"car_models\"]/div/ul/li[";
		String xpath2 = "]";
		String xpath3 = Integer.toString(getRanNum);
		String xpath4 = xpath1+xpath3+xpath2;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("newxpath is:" + xpath4 );
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath(xpath4)).click();
		
		
	
		
		
		
		
		

	}

}
