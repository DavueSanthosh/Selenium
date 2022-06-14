package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		
		
		WebDriverManager .chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Santhosh");

		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Kumar");
		
		
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
