package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
	
		WebElement position = driver.findElement(By.id("position"));
		
		Point location = position.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		
		WebElement bgm = driver.findElement(By.id("color"));
		
		String cssValue = bgm.getCssValue("background-image");
		System.out.println(cssValue);
		
		
		
		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		
		WebElement click = driver.findElement(By.id("home"));
		click.click();
		
		
		
		
	}

}
