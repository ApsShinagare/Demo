import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class window_handle {

	public static void main(String[] args) throws InterruptedException  {
		
	/*	WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4qsiujpf5j_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=13155757272639338323&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062114&hvtargid=kwd-360364908477&hydadcr=14451_2154369&gclid=EAIaIQobChMIzuGziK7G_AIVepJmAh2V1woJEAAYASAAEgJlOPD_BwE");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("notebook");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/div/span/input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Get It Today']/..//i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Luxor 5 Subject Single Ruled Notebook - A4, 70 GSM, 300 pages']")).click();
		
		//driver.findElement(By.id("add-to-cart-button")).click();
		
		
		
		//	ZString winhandle = driver.getWindowHandle();
		
		
		
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		String parentsessionid = it.next();
		String childsessionid = it.next();
		
		System.out.println(childsessionid);
		
		
		driver.switchTo().window(childsessionid); 
		driver.findElement(By.id("add-to-cart-button")).click(); */
		
		
		// ***Web Amzone*****
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462756374&hvpos=&hvnetw=g&hvrand=8028378137647668640&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062114&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=Cj0KCQiAlKmeBhCkARIsAHy7WVtIt1RJnPnMWVYC2VPytXm1WXcOO0xeERVQsRVQPaD0oDaC1SNNthUaApHfEALw_wcB");
		WebElement  listbox=driver.findElement(By.id("searchDropdownBox"));
		Thread.sleep(2000);
		Select s=new Select(listbox);
		s.selectByValue("search-alias=apparel");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirt");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//window handle
	driver.findElement(By.xpath("//span[text( )=\"Men's Regular Fit Pure Cotton Round Neck Half Sleeve Printed T-Shirt\"]")).click();
		
		Set<String> sid=driver.getWindowHandles();
		
		Iterator<String> newid=sid.iterator();
		String PsessionID=newid.next();
		
		String CsessionID=newid.next();
	//	String CsessionID1=newid.next();
		//String CsessionID2=newid.next();
		
		System.out.println("Parent session id"+PsessionID);
		System.out.println("1 st child session id"+CsessionID);
		//System.out.println(" 2ed child session id"+CsessionID1);
		//System.out.println("3rdchild session id"+CsessionID2);
		
		driver.switchTo().window(CsessionID);
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		
		
		
		
		
		
	}

}
