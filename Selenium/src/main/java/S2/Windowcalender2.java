package S2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowcalender2 {

	public static void main(String[] args )
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		String mm="sep";
		String dd="10";
		String yy="2023";
		int i=1;
		while(i<=12)
		{
			try
			{
				driver.findElement(By.xpath("//div[contains(@aria-label,'"+mm+" "+dd+" "+yy+"')],")).click();
				driver.findElement(By.xpath("//span[text()='Done']")).click();
				break;
			}
			catch(Throwable t)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month'")).click();
			}
		}
	
		
	}

}
