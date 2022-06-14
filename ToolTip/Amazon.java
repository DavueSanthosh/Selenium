package ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=onepluss&crid=3OVO87SSHLULD&sprefix=oneplus%2Caps%2C240&ref=nb_sb_noss_1");
		
		
		WebElement tool = driver.findElement(By.className("a-icon-alt"));
		String attribute = tool.getAttribute("Text");
		
		
		System.out.println(attribute);
	}

}
