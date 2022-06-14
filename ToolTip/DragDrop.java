package ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement first = driver.findElement(By.id("draggable"));
		WebElement second = driver.findElement(By.id("droppable"));
		
		
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(first, second).build().perform();
	}

}
