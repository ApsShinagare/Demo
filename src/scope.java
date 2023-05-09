import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//total count of links
		
		System.out.println("Total links on web page:-" +driver.findElements(By.tagName("a")).size());


		//link count on footer
		WebElement footerlink=driver.findElement(By.id("navFooter"));
		System.out.println("Links in Fotter:-"+footerlink.findElements(By.tagName("a")).size());
		
		//GET 1st column in  footer
		
	WebElement  columnlinks=footerlink.findElement(By.xpath("//div[text()=\"Get to Know Us\"]/..//div"));
	System.out.println("Column links count:-"+columnlinks.findElements(By.tagName("a")).size());
	
	//open links on separate tab
	
	for(int i=1;i<columnlinks.findElements(By.tagName("a")).size();i++)
{
	String linkcount=Keys.chord(Keys.CONTROL,Keys.ENTER);
	columnlinks.findElements(By.tagName("a")).get(i).sendKeys(linkcount);
	Thread.sleep(20000);
	
	
}
	
		
	}

}
