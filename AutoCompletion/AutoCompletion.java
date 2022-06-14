package AutoCompletion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompletion {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("tags"));
		search.sendKeys("s");
		//Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> firstElement = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		for (WebElement webElement : firstElement) {
			
			if (webElement.getText().equals("SOAP")) {
			
			webElement.click();
			webElement.getText();
			
		}
		
		}
		
		
		
		
		
		

	}

}
