package sl;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=4p6b4atq5lqgg");
		//driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.name("password")).sendKeys("manager");
		WebElement un=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("password"));
		WebElement lng=driver.findElement(By.id("loginButton"));
		un.sendKeys("admin");
		
		File src=pwd.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\New folder//Admin");
		Files.copy(src, dest);
		

	}

}
