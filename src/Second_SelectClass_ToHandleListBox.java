import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Second_SelectClass_ToHandleListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://fatcow.com/");
		//driver.findElement(By.xpath("//select[@name='country']")).click();
		
		
		//to inspect the listbox
		WebElement a=driver.findElement(By.xpath("//select[@name='country']"));
	   
		//Use the select class(select class is used for list box) and pass webelement as an argument
		//listbox=click and open
		Select s=new Select(a);
		//select  option by using index.
		//s.selectByIndex(2);
		//select option by using value attribute value
		//s.selectByValue("CAD");
		//select option using visible text
	//	s.selectByVisibleText("Australia");
		
		//select all the options
		//getoption retuen  type List of WebElement
		List<WebElement> va = s.getOptions();
		
		//To print the all values in list
		for(int i =0;i<=va.size()-1;i++)
		{
			//to get i element of webelement
			WebElement wb=va.get(i);
			//to get text from webelement
			String st=wb.getText();
			System.out.println(st);
			
		}
		
		//insted of above for loop we can use below for loop.
		/*
		 * for( WebElement ele : va) { String str = ele.getText();
		 * System.out.println(str); }
		 */
		
		
		
		
		
		
		//driver.close();
		
		
		
		/*
		 * 1 .https://www.facebook.com/ 2. create new account 3. print all months in
		 * month list
		 */
		
		
	/// facebook element locate
		
		//driver.get("https://www.facebook.com/login/");
	}

}
