package AutoCompletion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_5ikydyrck9_b&adgrpid=58972567855&hvpone=&hvptwo=&hvadid=294134771434&hvpos=&hvnetw=g&hvrand=6446955805636220989&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20469&hvtargid=kwd-513872812020&hydadcr=5839_1738693&gclid=Cj0KCQjwwJuVBhCAARIsAOPwGATuXpTT_NdQG80gzC3zeDDtuU9OE7qiRNX8FFgOeh1SG6_okKfqihgaArqBEALw_wcB");
		
		WebElement name = driver.findElement(By.id("twotabsearchtextbox"));
		name.sendKeys("per");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> search = driver.findElements(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div"));
		
		for (WebElement webElement : search) {
			
			if (webElement.getText().equals("perfume")) {
				
				webElement.click();
				
			}
		}
		
		WebElement perfume = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span"));
		perfume.click();
		
		
		
		
	}

}
