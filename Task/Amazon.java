package Task;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("f");
		
		
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div"));
		
		for (WebElement webElement : findElements) {
			
			if (webElement.getText().equals("football")) {
				webElement.click();
			break;	
			}
			
		}
		
		Set<String> set = driver.getWindowHandles();
		
		for (String window : set) {
			
		driver.switchTo().window(window);
		
		}		
		
		WebElement product = driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div "));
		product.click();
		
		
		WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		cart.click();
		
		
		
	}

}
