package sl;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonwindow {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9645540627");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("achievers2003");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shirts for men");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Men's Cotton Regular Fit Short Sleeve Big Checks Chambray Shirt")).click();
        Set<String>st=driver.getWindowHandles();
        Iterator<String>it=st.iterator();
        String parent=it.next();
        String child=it.next();
        System.out.println(parent);
        System.out.println(child);
        driver.switchTo().window(child);
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/cart/view.html?ref_=nav_cart']")).click();

	}

}