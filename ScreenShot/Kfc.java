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

public class Kfc {

	public static void main(String[] args) throws IOException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://online.kfc.co.in/");

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);

		File file = new File("D:\\kfccc.png");
		try {
			FileHandler.copy(screenshotAs, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	
	
	TakesScreenshot screenshot2=(TakesScreenshot) driver;
	File screenshotAs2 = screenshot2.getScreenshotAs(OutputType.FILE);
	
	File file2=new File("D:\\second.png");
	
	FileHandler.copy(screenshotAs2, file2);
	
	
	Robot robot=new Robot();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rectangle=new Rectangle(screenSize);
	BufferedImage createScreenCapture = robot.createScreenCapture(rectangle);
	ImageIO.write(createScreenCapture, "png", file2);
	
}
}