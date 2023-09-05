package sl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=87iifj6di9k7p");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Tasks")).click();
		WebElement Users=driver.findElement(By.linkText("Users"));
		Actions act=new Actions(driver);
	    act.moveToElement(Users).perform();
		act.contextClick(Users).perform();
		Robot rbt= new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		Set<String>s=driver.getWindowHandles();
		Iterator<String>it=s.iterator();
		String parent=it.next();
		String child=it.next();
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	
		
		
       
        
	    
	   
}
}