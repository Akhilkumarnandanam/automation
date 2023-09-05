package S2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Tasks")).click();
		List<WebElement>chk=driver.findElements(By.xpath("//table[@class='listTable']/descendant::input[@type='checkbox']"));
		for(int i=0;i<=chk.size()-1;i++)
		{
			if(!chk.get(i).isSelected())
			{
				chk.get(i).click();
				Thread.sleep(2000);
			}
		}
		

	}

}
