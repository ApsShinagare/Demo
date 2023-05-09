import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assigment_7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//scroll window
		JavascriptExecutor js	=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		//getting total no of columns
		WebElement  we =driver.findElement(By.id("product"));
		List<WebElement> count=we.findElements(By.tagName("tr"));
		System.out.println("Total no  of rows - "+count.size());
		
		//getting total no of rows
		
		List<WebElement> columncount=we.findElements(By.xpath("tr/td"));
		
		System.out.println("Total no  of Columns - "+columncount.size());
	}
}