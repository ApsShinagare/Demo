import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class make_my_trip_e2e {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		//selecting city from
		//driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		Thread.sleep(5000);
		List<WebElement>  option=driver.findElements(By.xpath("//div[@class='pushRight font14 lightGreyText latoBold']"));
	 for(WebElement city:option)
	 {
		 if(city.getText().equalsIgnoreCase("PNQ"))
		 {
			city.click();
			break;
		 }
	 }
	 //selecting city to
	 
	 driver.findElement(By.cssSelector("label[for='toCity']")).click();
	 
	 List<WebElement> toCity=driver.findElements(By.xpath("//div[@id='react-autowhatever-1']//div[text()=\"DEL\"]"));
	 Thread.sleep(5000);
		for(WebElement toList:toCity)
		{
			if(toList.getText().equalsIgnoreCase("DEL"))
				toList.click();
			break;
		}
	}

}
