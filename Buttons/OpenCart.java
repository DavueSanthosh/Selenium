package Buttons;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	 
//	public void register() {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
      
         driver.get("http://www.google.com");
         driver.findElement(By.name("q")).sendKeys("opencart demo register"+Keys.ENTER);
         
//         
//         String parentwindow = driver.getWindowHandle();
//         
//         WebElement register = driver.findElement(By.linkText("Register"));
//         register.click();
//         Set<String> windowHandles = driver.getWindowHandles();
//         
//         
//  for (String string : windowHandles) {
//	
//	  driver.switchTo().window(string);
//	  
//}		
		
//	}
//   public void userName() {
//	   
//	   WebElement username = driver.findElement(By.id("input-username"));
//	   username.sendKeys("Santhosh Kumar");
//   }	
//	public void firstName() {
//		
//		WebElement firstName = driver.findElement(By.name("firstname"));
//		firstName.sendKeys("Santhosh");
//
//	}
//	public void lastName() {
//		
//     WebElement lastName = driver.findElement(By.id("input-lastname"));
//     lastName.sendKeys("Kumar");
//	
//	}
//   
//	public void email() {
//		
//		WebElement email = driver.findElement(By.id("input-email"));
//		email.sendKeys("davuesanthosh12@gmail.com");
//	}
//	
//	private void password() {
//		
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("346@89lkjg");
//		
//		System.out.println(driver.getTitle());
//		
//		WebElement submit = driver.findElement(By.linkText("Register"));
//		submit.click();
//		
//		
//	}
	
	}	
	
}
