package Task;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalBrand {
	static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

	driver.get("http://www.amazon.in/");
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("water bottles" + Keys.ENTER);
	driver.findElement(By.xpath("//*[@id='brandsRefinements']/ul/li[8]/span/div/a/i")).click();

	List<WebElement> list = driver.findElements(By.xpath("//*[@id='brandsRefinements']/ul/li"));

	for (int index = 0; index < list.size(); index++) {
		
	WebElement brands = list.get(index);
	System.out.println(brands.getText());
	
	}
	boolean brandList = list.contains("Cello");
	
	if (brandList) {
	System.out.println("Given Brand is Contain");
	}

	else {
	System.out.println("Given Brand is not Contain");
	}
	}
}
