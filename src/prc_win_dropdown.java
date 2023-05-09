import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prc_win_dropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("mumbai");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-id='66551']")).click();
		
		driver.findElement(By.id("dest")).sendKeys("na");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-id='624']")).click();
		
		//take Screenshot of page
		TakesScreenshot take=(TakesScreenshot)driver;
		
		File f1=take.getScreenshotAs(OutputType.FILE);
		
		String path="../Screenshots/Screenshot1/";
		
		File f2=new File(path);
		FileUtils.copyFile(f1, f2);
		
		
		
	/*driver.findElement(By.id("sign-in-icon-down")).click();
	driver.findElement(By.id("signInLink")).click();
	//Thread.sleep(5000);
	//998driver.findElement(By.xpath("//i[@class='icon-close']")).click();
	
	//WebElement frm=driver.findElement(By.id("redbusImage"));
	
	//WebElement mobile_text_field = driver.findElement(By.id("mobileNoInp"));
	Thread.sleep(4000);
	driver.switchTo().frame("mobileNoInp");
	Thread.sleep(2000);
	driver.findElement(By.id("mobileNoInp")).sendKeys("8806599341");
	//driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("8806599341");*/
	


	}

}
