package sl;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5km84u9k2k_e&adgrpid=61666692631&hvpone=&hvptwo=&hvadid=610714031665&hvpos=&hvnetw=g&hvrand=8548050023185835414&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062009&hvtargid=kwd-304880464215&hydadcr=14450_2316420");
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
		driver.findElement(By.name("email")).sendKeys("9645540627");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("achievers2003");
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("dumbels");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
		driver.manage().window().maximize();
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> it=s1.iterator();
		String parent=it.next();
		String child=it.next();
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(child);
		driver.findElement(By.name("submit.add-to-cart")).click();
		driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/cart/view.html?ref_=nav_cart']")).click();
		List<WebElement> names=driver.findElements(By.xpath("//span[text()='OtG ON THE GO 20 kgs Adjustable Steel Dumbbell and barbell Kit, ABS , Steel']"));
	    System.out.println(names.size());
	    
	    for(int i=0;i<=names.size()-1;i++) 
	    {
	    	System.out.println(names.get(i).getText());
	    }
	    
		List<WebElement> names1=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']"));
	    System.out.println(names1.size());
	    
	    for(int i=0;i<=names1.size()-1;i++) 
	    {
	    	System.out.println(names1.get(i).getText());
	    }

	
		
	
	
		
		
		 

	}

}
