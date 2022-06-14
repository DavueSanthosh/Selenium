package Selectable;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");

		List<WebElement> search = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		
//		Actions action=new Actions(driver);
//		action.keyDown(Keys.CONTROL)
//		.click(search.get(0))
//		.click(search.get(1))
//		.click(search.get(2)).build().perform();
//		
		Actions action=new Actions(driver);
		action.clickAndHold(search.get(0));
		action.clickAndHold(search.get(1));
		action.clickAndHold(search.get(2));
		action.build().perform();

	}

}
