package praticeTestcases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomSurnames {
	public static int  RandomSurnames;
	public static void getRandomSurnames(int min, int max) {
		Random r = new Random ();
		int RandomSurnames = r.nextInt((max-min)+1)+max;
		System.out.println("RandomSurnames is" + RandomSurnames);
	}

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='tgbgdpr-overlay-agree']")).click();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@role='button']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		getRandomSurnames(1,8);
		String xpath1 = "//*[@id=\\\"order_brochure\\\"]/div/form/div[7]/div[1]/div[3]/div/div/ul/li[";
		String xpath2 ="]/a)";
		String xpath3 = Integer.toString(RandomSurnames);
		String Newxpath = (xpath1+xpath3+xpath2);
		System.out.println("Newxpath is :" + Newxpath);
		driver.findElement(By.xpath(Newxpath)).click();
		
		
		
	}
	
	

}
