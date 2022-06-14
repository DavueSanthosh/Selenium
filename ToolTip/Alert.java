package ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://demoqa.com/alerts");
	 
	
	 
		WebElement findElement = driver.findElement(By.id("alertButton"));
		findElement.click();
		
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement okay = driver.findElement(By.id("confirmButton"));
		okay.click();
		
		org.openqa.selenium.Alert dismiss=driver.switchTo().alert();
		Thread.sleep(3000);
		
		
		dismiss.dismiss();
		
		WebElement prompt = driver.findElement(By.id("promtButton"));
		prompt.click();
		
		org.openqa.selenium.Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("san");
		alert2.accept();
		
	}

}
