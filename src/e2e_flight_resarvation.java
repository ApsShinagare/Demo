import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2e_flight_resarvation {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		
		Thread.sleep(2000);
		//selecting 3 adults and 1 child
		driver.findElement(By.id("divpaxinfo")).click();
		
		//selecting 2 Adults
		Thread.sleep(5000);
		for(int i=0;i<2;i++)
		{	
			driver.findElement(By.id("hrefIncAdt")).click();
		}
			Thread.sleep(4000);
			
		//click on 1 child	
		driver.findElement(By.id("hrefIncChd")).click();
		
		//done button
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//selecting currency
		
		WebElement web=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s= new Select(web);
		s.selectByVisibleText("AED");
		
		//selecting city from
		Thread.sleep(4000);
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
				driver.findElement(By.xpath("//a[@value='JSA']")).click();
				Thread.sleep(4000);
				//selecting  city from to
				driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
				
				Thread.sleep(2000);
				//selecting current date
				driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
	
			//checkbox student 
				
				driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
				
				//radio button
				
			System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isEnabled());
	
			//take sereenshot
			screenshot(driver);
			
			//submit button
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
			
			
	}

	public static void screenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot take	=(TakesScreenshot)driver;
		File  f1=take.getScreenshotAs(OutputType.FILE);
		String s1="../Screenshots/Screenshot";
		File f2=new File(s1);
		FileUtils.copyFile(f1, f2);
		
		
	}
	
}
