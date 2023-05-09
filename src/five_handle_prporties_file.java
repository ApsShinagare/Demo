import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class five_handle_prporties_file {

	public static void main(String[] args) throws IOException {
		
		//creating sample_test file and give the path
		String str="C:/Users/Mahesh/eclipse-workspace/Intro/src/sample_test.properties";
		
		//giving that file to program by using fileinputstream class
		FileInputStream file=new FileInputStream(str);
		
		//creating object of properties class
		Properties pro=new  Properties();
		
		//load the file usinhg load() method
		pro.load(file);
		
		//get the value from sample_test.properties file by passing key in string format
		String url=pro.getProperty("rahulshetty_url");
		
		//open url
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		//get the username value from sample-test.properrties file
		String un= pro.getProperty("Username");
		driver.findElement(By.id("inputUsername")).sendKeys(un);
		
		//get the password from sample-test.properrties
		String pw=pro.getProperty("Password");
		driver.findElement(By.name("inputPassword")).sendKeys(pw);
		
		
		
		
		
	}

}
