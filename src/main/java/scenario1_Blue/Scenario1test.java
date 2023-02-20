package scenario1_Blue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1test {
	public static WebDriver driver;
	
		public static void initDriver() {
			
			System.setProperty("webdriver.chrome.driver", "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://techfios.com/test/101/");
			
			if (driver.findElements(By.name("Set SkyBlue Background")).size()!=0){
				
			System.out.println("Element is present on the page");
			
			}else{
				System.out.println("element is missing");
				
				driver.close();
		}
	}
}
 


