package Sortable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		WebElement first = list.get(3);
		WebElement second = list.get(0);
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(first);
		actions.moveToElement(second);
		actions.release(second);
		actions.build().perform();
		
		
		
	}

}
