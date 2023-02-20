package background1steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import scenario1_Blue.MainpageSc1;
import scenario1_Blue.Scenario1test;

public class Bluebackground1step extends Scenario1test{
	
	MainpageSc1 mainpage;
	
	@Before
	public void beforeRun() {
	
	}
	
	@Given ("^Set SkyBlue Background button exists$")
	public void set_skyblue_background_button_exists() {
		initDriver();
		driver.get("https://techfios.com/test/101/");
}
	
	@When ("^I click on the button$")
	public void i_click_on_the_button() {
		mainpage = PageFactory.initElements(driver, MainpageSc1.class);
		mainpage.clickOntheButton();
		driver.findElement(By.name("Set SkyBlue Background")).click();
	}

		
	@Then ("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		
	}
	}
	
