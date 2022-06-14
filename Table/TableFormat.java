package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableFormat {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		
	//JavascriptExecutor executor=(JavascriptExecutor) driver;
	//executor.executeScript(window, args)
	//executor.executeScript("window.scrollBy(0,1000)","");
	
	int row = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
	System.out.println("Row size is"+row);
		
	
	int column = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th")).size();
	System.out.println("Column Size is"+column);
	
	
	WebElement specElement = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[3]/td[1]"));
	String text = specElement.getText();
	System.out.println(text);
	
	
	WebElement secondElement = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[5]/td[3]"));
	String two = secondElement.getText();
	System.out.println(two);
	
	
	
	
	
	
	
	
//	WebElement first = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr/th[1]"));
//	first.getText();
//	
	
	
	
	
	
	
	
	
	/*for (int r = 2;r <=row; r++) {
		
	
		
		
		for (int c = 1; c <= column; c++) {
			
			WebElement last = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+r+"]/td["+c+"]"));
			String text2 = last.getText();
			
			System.out.println(text2);
		}
			
	}*/
	
	for (int r = 2; r <row; r++) {
		
		String onlyRow = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+r+"]/td[1]")).getText();
		
		if (onlyRow.equals("Meta")) {
			
			WebElement findElement = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+r+"]/td[3]"));
			String string = findElement.getText();
			System.out.println(string);
		}
	
	
	
	}
	}	
	
	}


