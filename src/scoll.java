import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class scoll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//scrooling the window
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_6'] div[class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style'] span:nth-child(1)")).click();
		
		addcard(driver);
		
	}
	public static void addcard(WebDriver driver) throws InterruptedException
	{
		
		Set<String> sID=driver.getWindowHandles();
		Iterator<String> nid=sID.iterator();
		String pid=nid.next();
		String cid=nid.next();
		driver.switchTo().window(cid);
		Thread.sleep(3000);
		
		//Actions a=new Actions(driver);;
		//a.moveToElement(driver.findElement(By.id("magnifierLens"))).build().perform();
		
		//add to card
		//driver.switchTo().frame(driver.findElement(By.))
		//driver.findElement(By.xpath("//p[@class='a-spacing-none a-size-small _apple-brand-showcase_showcase_hidden-overflow__1m64t']/span[text()=\"MacBook Air\"]")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("a-autoid-5")).click();
		
		//Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//scrooling the window
		js.executeScript("window.scrollBy(0,150)");
		
		//add to card button
		driver.findElement(By.id("submit.add-to-cart")).click(); 
		
	
		
		
	}

}
