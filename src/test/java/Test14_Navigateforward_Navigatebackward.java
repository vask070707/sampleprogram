// Test 14 : program for navigate back and navigate forward

package githubdemomarch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14_Navigateforward_Navigatebackward
{
public static void main(String[] args) throws InterruptedException
	{
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
		//To maximize the window driver.manage().window().maximize();
		//To delete the cookies
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		//To enter the url 
		driver.navigate().to("https://www.facebook.com/"); 
		Thread.sleep(1000);
		//To navigate to previous page 
		driver.navigate().back(); // go back to google.com
		Thread.sleep(1000);
		//To navigate to next page 
		driver.navigate().forward(); // go back to facebook
		Thread.sleep(1000);
		//Refresh current web page 
		driver.navigate().refresh();
     }
}

