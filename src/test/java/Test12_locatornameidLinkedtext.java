// Test 12 - Usage of locators

package githubdemomarch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test12_locatornameidLinkedtext
{
	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//Launch site using base based url
		driver.get("http://www.github.com/login");
		Thread.sleep(5000);
		
		//Using ID locator - user id field
		WebElement e=driver.findElement(By.id("login_field"));
		e.sendKeys("ayesha123@gmail.com");
		
		//using name locator - password field
		WebElement e1=driver.findElement(By.name("password"));
		e1.sendKeys("secrettell");
		Thread.sleep(7000);
				
		//using partial link text 
		WebElement e4=driver.findElement(By.linkText("Create an account"));
		   e4.click();
		   Thread.sleep(5000); 
	}		 	
}
