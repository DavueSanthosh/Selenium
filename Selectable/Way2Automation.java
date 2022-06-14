package Selectable;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Way2Automation {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/selectable.php#load_box");
		
		WebElement navigate = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[2]/a"));
		navigate.click();
		
		//List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		WebElement findElement = driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
		findElement.click();

//		Actions action=new Actions(driver);
//		action.clickAndHold(findElements.get(2));
//		action.clickAndHold(findElements.get(1));
//		action.clickAndHold(findElements.get(4));
//		action.build().perform();
	}

}
