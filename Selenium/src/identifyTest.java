import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class identifyTest {
public static void main (String [] args)  {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://gmail.com");
	 
	//Identify Element in GUI
WebElement wb= driver.findElement(By.id("identifier ID"));

//Performance type operation

	
		

			

}
}
