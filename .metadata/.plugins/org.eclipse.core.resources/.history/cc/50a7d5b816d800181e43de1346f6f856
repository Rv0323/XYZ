import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class company 
	{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://visitorpryce.ap-southeast-1.elasticbeanstalk.com/");
		driver.findElement(By.name("Name")).sendKeys("pryce");
		
	}
	}
