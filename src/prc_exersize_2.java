import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prc_exersize_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Aparna");
		driver.findElement(By.name("email")).sendKeys("apsh@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("apsh8806");
		
		Thread.sleep(2000);
		//checkbox
		driver.findElement(By.id("exampleCheck1")).click();
		System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
		
		Thread.sleep(2000);
		//select drop down
		WebElement gender=driver.findElement(By.id("exampleFormControlSelect1"));
		Select s=new Select(gender);
		
		s.selectByVisibleText("Male");
		
		//checkbox
		Thread.sleep(2000);
		driver.findElement(By.id("inlineRadio1")).click();
		//dob
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=\"Date of Birth\"]/../input")).sendKeys("20/may/1995");
		
		//submit button
		
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		
		//mesage
		
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());

	}

}
