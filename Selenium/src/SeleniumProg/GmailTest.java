package SeleniumProg;

//	https://mail.google.com

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.name("identifier")).sendKeys("anjusri4@gmail.com" );
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("anjula5*");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@href='https://mail.google.com']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		//		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
		



	}

}
