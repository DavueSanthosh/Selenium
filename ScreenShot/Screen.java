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

public class Screen {

	public static void main(String[] args) throws IOException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://online.kfc.co.in/");

//		
//		TakesScreenshot screenshot=(TakesScreenshot) driver;
//		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);

		File file = new File("D:\\screen.png");
		// FileHandler.copy(screenshotAs, file);

//		Robot robot = new Robot();
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		Rectangle rectangle = new Rectangle(screenSize);
//		BufferedImage createScreenCapture = robot.createScreenCapture(rectangle);
//		ImageIO.write(createScreenCapture, "png", file);

		
		Robot robot=new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage createScreenCapture = robot.createScreenCapture(rectangle);
		ImageIO.write(createScreenCapture, "png", file);
		
		
	}

}
