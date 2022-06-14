package Waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicityWaits {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("f");

		 driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		//WebDriverWait driverWait = new WebDriverWait(driver, 20);
		
		//driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div")));

		List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div"));

		for (WebElement webElement : findElements) {

			if (webElement.getText().equals("football")) {
				webElement.click();
				webElement.getText();

			}

		}

	}

}
