//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_locators_prac
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/locatorspractice");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("inputUsername")).sendKeys("Aparna");
		  driver.findElement(By.name("inputPassword")).sendKeys("apsh@8806");
		  driver.findElement(By.linkText("Forgot your password?")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sonu");
		  
		  driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("apsh@8805");
		  driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("8806599341");
		 driver.findElement(By.xpath("//div/button[2]")).click();
		  System.out.println(driver.findElement(By.className("infoMsg")).getText());
		  
		  driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("input[placeholder*='User']")).clear();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys("Aparnarr");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[contains(@type,'pass')]")).clear();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy");
		  Thread.sleep(2000);
		  //driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
		  driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		  
		 
		
		
		
	}

}
