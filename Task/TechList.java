package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TechList {

	WebElement table;
	WebDriver driver;

	public void header() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

		table = driver.findElement(By.xpath("//*[@id='post-body-5867683659713562481']/div[1]/div[4]/table"));

		List<WebElement> first = table.findElements(By.tagName("th"));

		for (WebElement title : first)
		{

			String text = title.getText();
			
			System.out.println("Header File:" + text);

		}
		System.out.println(" ");
	
	
		int size = table.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table/tbody/tr")).size();
		
		for (int index = 1; index < size; index++) {
			
			WebElement findElement = table.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table/tbody/tr["+index+"]/th"));
			String text = findElement.getText();
			System.out.println(text);
			
		}
		
		
	
	}
	
	
	
	public void Structure() {

		List<WebElement> allrows = table.findElements(By.xpath("//*[@id='post-body-5867683659713562481']/div[1]/div[4]/table/tbody/tr/th"));
		int size = allrows.size();

		System.out.println(" ");
		
		if (size == 4) {

			System.out.println("The Structure row is four");
		}
		else
		{
			System.out.println("The Structure row more than four");
		}

	}

	public void totalText() {

		List<WebElement> totalRowData = table.findElements(By.tagName("tr"));

		System.out.println("TOTAL DATA IN THE TABLE");
		
		
		for (WebElement rowData : totalRowData) {

			String text = rowData.getText();
			System.out.println(text);
		}
		
     System.out.println(" ");
	
	}

	public void highest() {

		List<WebElement> compare = driver.findElements(
				By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table/tbody/tr/td[3]"));

		List<Integer> list = new ArrayList<Integer>();

		for (WebElement stringNumber : compare) {

			String text = stringNumber.getText().replace("m", "");
			
			list.add(Integer.parseInt(text));

		}

		System.out.println("Total List of the Height:" + list);
		System.out.println(" ");
		
		
		Integer max = Collections.max(list);
		System.out.println("Biggest height in the Table:" + max);

	}

	public void lastRow() 
	{

		WebElement lastRow = driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]"));

		
		List<WebElement> footertext = table.findElements(By.xpath("//table[@class=\"tsc_table_s13\"]/tfoot//tr"));

		int lastColumn = footertext.size();
		System.out.println(" ");
		System.out.println("It has " + lastColumn + "  column");

	}

	public static void main(String[] args) {

		TechList list = new TechList();
		list.header();
		list.totalText();
		list.highest();
		list.lastRow();
		list.Structure();
	}

}

//for (WebElement webElement : allrows) {
//	List<WebElement> columns = webElement.findElements(By.tagName("td"));
//	WebElement firstcolumn = columns.get(0);
//	System.out.println(firstcolumn.getText());
//}

//
//	List<WebElement> column = table.findElements(By.cssSelector("tfoot tr td"));
//int lastRow = column.size();
//System.out.println("Last Row size:"+lastRow);