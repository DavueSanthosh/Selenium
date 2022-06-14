package UploadAndDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement click = driver.findElement(By.xpath("//*[@id=\"mydiv\"]/input"));
		click.click(); 
		
		
		
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	
//		String file="D:\\Excel.xlsx";
//		
//		StringSelection selection=new StringSelection(file);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_COPY);
//		//Thread.sleep(3000);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_COPY);
//		
		
	}

}
