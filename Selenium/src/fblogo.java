import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fblogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("8092277393");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("luv0pearl");
		
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	
	}
	

}
