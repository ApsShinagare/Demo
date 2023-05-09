import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.runtime.Runtime.GetPropertiesResponse;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

public class prac_all_locators_facebbok

{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		/*
		 * String name="Aparnar"; WebDriver driver=new ChromeDriver();
		 * driver.get("https://rahulshettyacademy.com/locatorspractice");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys(
		 * name);
		 * driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys(
		 * "rahulshettyacademy"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		 * Thread.sleep(2000);
		 * System.out.println(driver.findElement(By.tagName("p")).getText());
		 * Assert.assertEquals(driver.findElement(By.tagName("p")).getText()
		 * ,"You are successfully logged in."); //
		 * Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(),"Hello"+
		 * name+" ,");
		 * driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		 */
		
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/login/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Sign up for Facebook")).click();
		  driver.findElement(By.name("firstname")).sendKeys("Aparna");
		 Thread.sleep(1000);
		  driver.findElement(By.name("lastname")).sendKeys("Shinagare");
		  driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("8806599341");
		  driver.findElement(By.cssSelector("input[id='password_step_input' ]")).sendKeys("apshh@8806");
		  
		  //using newselectcls method cll the method
		  newseleccls(driver);
		  
		  //loging fb by using newfile method
		  newfile(driver);
		  
		  driver.findElement(By.xpath("//div/button[@value='1']")).click();
		  
		  }


public static void newseleccls(WebDriver driver)
{
	//locating elecment using select cls
	WebElement a=driver.findElement(By.xpath("//select[@aria-label='Day']"));
	Select s=new Select(a);
	s.selectByValue("20");
	
	//locating month list box
	
	WebElement a1=driver.findElement(By.cssSelector("select[aria-label='Month']"));
	Select s1=new Select(a1);
	s1.selectByValue("5");
	
	//locating year list box
	
	WebElement a2=driver.findElement(By.id("year"));
	Select s2=new Select(a2);
	s2.selectByVisibleText("1995");
	
	
	//locating gender check-box
	
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	driver.navigate().back();
	
}
public static void  newfile(WebDriver driver) throws IOException
{
	//geting file location
	String fbdetails="C:/Users/Mahesh/eclipse-workspace/Intro/src/UserID_pwd_fb";
	
	//giving file
	FileInputStream file=new FileInputStream(fbdetails);
	
	//creating prpertie cls object
	
	Properties p=new Properties();
	
	//fetch the data from file by using load method
	
	p.load(file);
	
	//geting info from file
	
	String useid=p.getProperty("Username");
	driver.findElement(By.id("email")).sendKeys(useid);
	
	String pwd=p.getProperty("Password");
	driver.findElement(By.id("pass")).sendKeys(pwd);
}
}