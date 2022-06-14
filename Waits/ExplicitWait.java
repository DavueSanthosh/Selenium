package Waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("W");
		
		WebDriverWait driverWait=new WebDriverWait(driver, 30);
		driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'nav-flyout-searchAjax\']/div[2]/div")));
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\'nav-flyout-searchAjax\']/div[2]/div"));
		
		for (WebElement webElement : findElements) {
			
			if(webElement.getText().equals("wall clock")) {
				webElement.click();
			}
			
		}

		
		
	}

}
