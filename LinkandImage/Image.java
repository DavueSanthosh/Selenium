package LinkandImage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://www.leafground.com/pages/Image.html");
		
		WebElement firstImage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		firstImage.click();
		
		driver.navigate().back();
		
		WebElement broken = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		broken.click();
		
		if (broken.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image is Broken");
		}
		else
		{
		
			System.out.println("The image is Perfect");
			
		}
		
		
		
		
	}

}
