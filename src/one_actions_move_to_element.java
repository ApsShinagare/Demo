import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class one_actions_move_to_element {

	public static void main(String[] args) {
		
		// to create chromedriver object
		WebDriver  driver=new ChromeDriver();
		// to maximise window
		driver.manage().window().maximize();
		// to access web url
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_1jyasdi57f_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=6469927493991084111&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062114&hvtargid=kwd-295905178780&hydadcr=14451_2154369&gclid=Cj0KCQiA5NSdBhDfARIsALzs2EBqKlll5ii7d9YZ6PXgQmPqwx9M57mvtq9VpXJqFiR-eJJQyNpSrNEaAhJZEALw_wcB");
		
		// to locate element to store in veriable ( as retun type of findelement is webelement)
		// Syntax to write classname all different words are in capital
		WebElement all=driver.findElement(By.xpath("//i[@class=\"hm-icon nav-sprite\"]"));
		
		//to  move the mouse to the expected element-first create Actions class object 
		//and pass driver as a argument
		Actions  a= new Actions(driver);
		
		//to  move the mouse to the expected element
		a.moveToElement(all).click().perform();
		
		
	}

}
