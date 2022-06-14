package ScreenShot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnePlus {

	public static void main(String[] args) throws IOException, AWTException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.oneplus.in/oneplus-nord-ce-2-lite-5g?utm_source=google_search&utm_medium=cpc&utm_campaign=NordCE2Lite_Generic_Desktop&utm_term=oneplus%20nord&gclid=CjwKCAjwtIaVBhBkEiwAsr7-cyFixMxSz32DHS7lmeDYiRRaC1GgV-fKdPYOcfYKjzRlska_zcOTKBoCag8QAvD_BwE&gclsrc=aw.ds");
	
	TakesScreenshot screenshot=(TakesScreenshot) driver;
	File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
	
	File file=new File("D:\\oneplus.png");
	FileHandler.copy(screenshotAs, file);
	
	
	
	
	Robot robot=new Robot();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rectangle=new Rectangle(screenSize);
	BufferedImage createScreenCapture = robot.createScreenCapture(rectangle);
	ImageIO.write(createScreenCapture, "png", file);
	
	
	
	
	
	
	
	}

}
