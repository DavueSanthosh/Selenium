package iFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrame {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		 driver.switchTo().frame(0);
		
		
		WebElement iframe = driver.findElement(By.id("Click"));
		iframe.click();
		String text = iframe.getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement click = driver.findElement(By.id("Click1"));
		click.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		
		System.out.println(size);
		
	}

}
