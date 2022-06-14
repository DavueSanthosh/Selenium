package Task;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tnstc {
	
	//public void dropDown() {
		
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
	
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("https://www.tnstc.in/TNSTCOnline/");
		 
		 
		 WebElement first = driver.findElement(By.id("matchStartPlace"));
		 first.sendKeys("Mayiladuthurai");
		
		 
		 WebElement scond = driver.findElement(By.id("matchEndPlace"));
		 scond.sendKeys("TRICHY");
		 
		 
		 WebElement third = driver.findElement(By.id("selectOnwardTimeSlab"));
		 //third.sendKeys("Before 12pm");
            Select select=new Select(third);
            //select.selectByValue("00:00-12:00");
            select.selectByIndex(2);
            
            
            
            
           // WebElement date = driver.findElement(By.name("txtdeptDateRtrip"));
            //date.sendKeys("30/05/2022");
//  	      Select select1=new Select(date);
//  	      select1.selectByValue("02/12/2067");
            
            
            List<WebElement> options = select.getOptions();
            int size = options.size();
            System.out.println(size);
            
		 
	      WebElement tickets = driver.findElement(By.id("txtAdultFemales"));
	      tickets.sendKeys("2");
	      
	      WebElement childTickets = driver.findElement(By.id("txtChildMales"));
	      childTickets.sendKeys("3");
	      
	      WebElement childFemale = driver.findElement(By.id("txtChildFemales"));
	      childFemale.sendKeys("1");
	      
	    
	
	}

}
