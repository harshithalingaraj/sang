package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pagesub.Subpage;

public class Club {
	WebDriver driver;
	@Before
	public void init()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\Drivers\\ChromeDriver.exe" );	
		driver=new ChromeDriver();
		PageFactory.initElements(driver,Subpage.class);
	}
	@After
	public void destroy()
	{
		driver.close();
	}
	@Given("enter the {string}")
	public void url(String s){
		driver.get(s);
		
	}
	
	@And("enter {string}")
	public void username(String un){
		Subpage.username.sendKeys(un);
	}
	@And("Enter {string}")
	public void password(String pw){
		Subpage.password.sendKeys(pw);
	}
	@Then("click login button")
	public void login(){
		Subpage.login.click();
	}

}
