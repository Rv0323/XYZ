import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class editbox {
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:8080/user/submit_tt.do");
		driver.findElement(By.id(".//*[@id='SubmitTTButton']"));
		driver.findElement(By.xpath(".//*[@id='SubmitTTButton']"));
		
		driver.close();
	}

}
