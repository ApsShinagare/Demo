import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_list_box {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[@class='_97w5']")).click();
		WebElement wb=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement wb1=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement wb2=driver.findElement(By.xpath("//select[@id='year']"));
		
		
		
		Select s=new Select(wb);
		s.selectByVisibleText("Jul");
		
		Select s1=new Select(wb1);
		s1.selectByValue("6");
		
		Select s2=new Select(wb2);
	     s2.selectByValue("2022");
		
		//List<WebElement> lw=s.getOptions();
		//To print Nov month
		
		//s.selectByVisibleText("Nov");
		
		//To print all the months 
		/*
		 * for(WebElement web:lw) {
		 * 
		 * 
		 * String str=web.getText(); System.out.println(str);
		 * 
		 * }
		 */
		
		//TO print odd months
		
		
		/*
		 * for(int i=0;i<=lw.size()-1;i++) { if(i%2 == 0) { WebElement ww=lw.get(i);
		 * String str1=ww.getText();
		 * 
		 * System.out.println(str1+" :-This is the odd months"); } }
		 */
	}

}
