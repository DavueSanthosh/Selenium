package UploadAndDownload;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://masstamilan.dev/kgf-chapter-2-telugu-songs");
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"tlist\"]/tbody/tr[4]/td[3]/a[1]"));
		findElement.click();
		
		Thread.sleep(8000);
		
		File fileName=new File("C:\\Users\\santhoshkumar.sankar\\Downloads\\Toofan-MassTamilan.mp3");
		boolean exists = fileName.exists();
		System.out.println(exists);
		
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
//		File[] totalFiles = fileName.listFiles();
//		System.out.println(totalFiles);
//		
//		for (File file : totalFiles) {
//			
//			if(file.getName().equals("Toofan-MassTamilan.mp3")) {
//				
//				System.out.println("The file is Created");
//				break;
//			}else {
//				System.out.println("File is Not created");
//			}
//			
		
	}

}
