import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen_shots {

	private static final String TakeScreenShot = null;

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("https://www.facebook.com/login/"); TakesScreenshot
		 * shot=(TakesScreenshot)driver; File scr =
		 * shot.getScreenshotAs(OutputType.FILE); String
		 * str="../Mahesh/Deskto/Screen_Shots"; File fl=new File(str);
		 * FileUtils.copyFile(scr,fl);
		 */
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		TakesScreenshot take=(TakesScreenshot)driver;
		Thread.sleep(2000);
		
		File f1=take.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		//String S1="../Mahesh/eclipse-workspace/Intro/src/Screen_Shots";
		String s1="../Screenshots/Screenshot";
		Thread.sleep(2000);
		File f2=new File(s1);
		Thread.sleep(2000);
		FileUtils.copyFile(f1, f2);
		Thread.sleep(2000);
		System.out.println("Done");
		

	
	}   
	
	

}
