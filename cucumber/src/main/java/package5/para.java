package package5;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class para {
	@Given("I am a {word} tester")
	public void a(String a)
	{
		System.out.println("I am a "+a+" tester");
	}
	@When("I go to work")
	public void b()
	{
		System.out.println("I go to work");
	}
	@Then("I {word} it")
	public void c(String c)
	{
		System.out.println("I "+c+" it");
	}
	@And("My boss {word} me")
	public void d(String d)
	{
		System.out.println("My boss "+d+" me");
	}
	@But("The developer {word} me")
	public void e(String e)
	{
		System.out.println("The developer "+e+" me");
		System.out.println("******************************************");
	}

}
