package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import scenario2_white.MainpageSc2;
import scenario2_white.Scenario2test;

public class Whiteback2step extends Scenario2test{ {

}
WebDriver driver; 

	MainpageSc2 mainpage;
	
	@Before
	public void beforeRun() {
	
	}
	
	@Given ("^Set SkyWhite Background button exists$")
	public void set_skywhite_background_button_exists() {
		driver.get("https://techfios.com/test/101/");
}
	
	@When ("^I click on the button$")
	public void i_click_on_the_button() {
		mainpage = PageFactory.initElements(driver, MainpageSc2.class);
		mainpage.clickOntheButton();
		driver.findElement(By.name("Set SkyWhite Background")).click();
	}

		
	@Then ("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		
	}
	
@After
	public void tearDown() {
   driver.close();
   driver.quit();
   
}

}
	