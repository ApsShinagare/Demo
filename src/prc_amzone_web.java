import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prc_amzone_web {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
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
		driver.findElement(By.id("add-to-cart-button")).click();
	}

}
