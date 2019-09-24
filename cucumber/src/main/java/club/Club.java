package club;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Club {
	WebDriver driver;
	@Before
	public void init()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.30\\Desktop\\Drivers\\ChromeDriver.exe" );	
		driver=new ChromeDriver();
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
		driver.findElement(By.id("userName")).sendKeys(un);
	}
	@And("Enter {string}")
	public void password(String pw){
		driver.findElement(By.id("password")).sendKeys(pw);
	}
	@Then("click login button")
	public void login(){
		driver.findElement(By.name("Login")).click();
	}

}
