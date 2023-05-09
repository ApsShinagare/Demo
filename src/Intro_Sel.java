import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intro_Sel {
	public static void main(String[] args)
	{
		
		//ChromeDriver driver= new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Documents\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		/*
		 * driver.get("https://rahulshettyacademy.com/");
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * driver.quit();
		 */
		
		//driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=7590279960914830327&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062114&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA1ZGcBhCoARIsAGQ0kkq5_Ao-8atrwnSpclPFCZYyRSrmkmUHJookwjVe-nRFiHyhPEUgL-8aArorEALw_wcB");
		//driver.get("https://www.youtube.com");
		
		//firefox  launtch
		//gechodriver
		
		
		System.setProperty("webdriver.gecho.driver", "C:\\Users\\Mahesh\\Documents\\geckodriver-v0.32.0-win32\\gecko.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/");
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		
		  //microsoft edge driver launtch
		  

			//System.setProperty("webdriver.edge.driver", "C:\\Users\\Mahesh\\Documents\\geckodriver-v0.32.0-win32\\gecko.exe");
			//
		  //     WebDriver driver=new EdgeDriver();
		  
		//driver.close();
	}

}
