// Test 13 : program for delete cookies in a browser 
// program for getting the current url

package githubdemomarch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13_getcurrenturltitle
{
public static void main(String[] args) throws InterruptedException
  {
    WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	//To maximize the window driver.manage().window().maximize();
	//To delete the cookies
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com/");
	String s = driver.getCurrentUrl();
	System.out.println(s);
  
  }
}