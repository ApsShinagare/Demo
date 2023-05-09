import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prctice {

	public static void main(String[] args) throws InterruptedException, IOException {
			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Kar");
		Thread.sleep(2000);
		List<WebElement> cities=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
		Thread.sleep(2000);
		for(WebElement city:cities)
		{
		
				if(city.getText().equalsIgnoreCase("Karad"))
				{
					city.click();
					break;
				}
		}
		
		//for destinationn
		
		driver.findElement(By.id("dest")).sendKeys("mum");
		Thread.sleep(2000);
		
		List<WebElement> dcities	=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']"));
	
		for(WebElement dcity:dcities)
		{
		
				if(dcity.getText().equalsIgnoreCase("Mumabai"))
				{
					dcity.click();
					break;
				}
		}
	}

}
