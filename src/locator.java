import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get("https://rahulshettyacademy.com/locatorspractice");
		///driver.findElement(By.id("inputUsername")).sendKeys("Aparna");
		//driver.findElement(By.name("inputPassword")).sendKeys("abccdefgh456");
		//driver.findElement(By.className("signInBtn")).click();
		  //driver.findElement(By.cssSelector("p.error")).getText();
		//******facebook login******//
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfcUy3DLhvVMOMmIixK7wlQE8a0q2N1mbThhuNhfG0WaP--xthlcppWBWZf-L7XI-eLyjkVvgoYbKYOYJ4hZslSRgwtOyZOU4MF_nISSx2Dvuw&smuh=1464&lh=Ac_SK4eEnoaInL51RKM");
		driver.findElement(By.id("email")).sendKeys("8806599341");
		driver.findElement(By.id("pass")).sendKeys("apsh@8806ah");
		driver.findElement(By.name("login")).click();
		//class="x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z"
				driver.findElement(By.className("x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z")).click();	
				
	   System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
	   
	}

}
