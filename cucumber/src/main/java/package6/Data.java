package package6;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Data {
	@Given("There are {word} friuts")
	public void ab(String a,DataTable t)
	{
		List<Map<String,String>>data=t.asMaps(String.class,String.class);
		System.out.println("There are "+a+" fruits with "+data.get(0).get("with")+" of "+data.get(0).get("type"));
		System.out.println("There are "+a+" fruits with "+data.get(1).get("with")+" of "+data.get(1).get("type"));
		
	}
	@When("I eat {word} fruits")
	public void bc(String b)
	{
		System.out.println("I eat "+b+" fruits");
	}
	@Then("I have {word} fruits")
	public void cd(String c)
	{
		System.out.println("I have "+c+" fruits");
		System.out.println("**************************************************");
	}

}
