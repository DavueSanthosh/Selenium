package ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		WebElement toolTip = driver.findElement(By.id("age"));
		String attribute = toolTip.getAttribute("title");
		
		System.out.println(attribute);
		
		
		
		
	}

}
