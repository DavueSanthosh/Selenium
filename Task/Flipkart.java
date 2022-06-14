package Task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args)
	
	{
		WebDriver driver;
		Properties properties = null;
		
		String Path=System.getProperty("user.dir");
		String propertiesPath= Path+File.separator+"Setup"+ File.separator+"selenium.properties";
	
		System.out.println(propertiesPath);
		File file= new File(propertiesPath);

		
		FileInputStream inputStream = null;
		
		try {
			
		inputStream = new FileInputStream(file);

		 properties = new Properties();
		properties.load(inputStream);
		} 
		
		catch (IOException expection) {
			
			System.out.println("Input output expection");
		}

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(properties.getProperty("websiteUrl"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Alert alert = driver.switchTo().window(driver.getWindowHandle()).switchTo().alert();
//		alert.dismiss();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	WebElement popup = driver.findElement(By.xpath(properties.getProperty("popUpXpath")));
	popup.click();    

		WebElement search = driver.findElement(By.name(properties.getProperty("searchName")));
		search.sendKeys("redmi mobiles" + Keys.ENTER);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> total = driver.findElements(By.className(properties.getProperty("ratingClass")));

		System.out.println(total.size());
		
		
		List<Float> list = new ArrayList<Float>();

		for (WebElement webElement : total) {

			
			String text = webElement.getText();
			//System.out.println(text);
			
			list.add(Float.parseFloat(text));
               
			}

		Float min = Collections.min(list);
		System.out.println(min);
		
		
		
		Float max = Collections.max(list);
		System.out.println(max);
				


//			else if (text.contains("5")) {
//				System.out.println("Lesser than:"+text);
//			}
//			
//			else if (text.equals("4")) {
//				System.out.println("Equal to:"+text);
//			}
//				
		}

	}


