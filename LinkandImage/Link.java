package LinkandImage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement firstLink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		firstLink.click();
		
		 driver.navigate().back();
		 
		 WebElement secondLink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		 String attribute = secondLink.getAttribute("href");
		 
		 System.out.println(attribute);
		 
		 
		WebElement thirdLink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a"));
		thirdLink.click();

		String title = driver.getTitle();
		
		if (title.contains("404")) {
			System.out.println("The Link is Broken");
		}
		
		else
		{
			System.out.println("The Link is not Broken");
		}
		
		
		driver.navigate().back();
		
		WebElement fourLink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a"));
		fourLink.click();
		
		driver.navigate().back();
		
		List<WebElement> lastLink = driver.findElements(By.tagName("a"));
		int size = lastLink.size();
		
		System.out.println(size);
		
		
	}

}
