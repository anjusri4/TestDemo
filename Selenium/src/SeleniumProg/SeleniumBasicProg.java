package SeleniumProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasicProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // System.out.println("welcome to selenium");
      System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver_win32 (2)\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
     // driver.findElement(By.name("firstname")).sendKeys("Giri");
      //driver.findElement(By.xpath("//*[@id=\"u_0_k\"]/div[1]")).sendKeys("P");
      //Working with select box/drop down/list box
      WebElement path=driver.findElement(By.id("month"));
      
      Select sel=new Select(path);
     // sel.selectByIndex(1);
     // sel.selectByValue("Feb");
     List<WebElement> lst=sel.getOptions();
    /* for (WebElement we : lst) {
    	 
    	String str= we.getText();
    	 System.out.println(str);
    	 sel.selectByVisibleText(str);
    	
		
	}
    *
    */  
     List<WebElement> lst1 = sel.getOptions();
     for(int i=0;i<lst1.size();i++) {
    	 
    	 String Str=lst1.get(i).getText();
    	 System.out.println(Str);
    			 
    	
	}
     driver.close();
	}

}
