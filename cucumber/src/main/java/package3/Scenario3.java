package package3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Scenario3 {
	@Given("I enter {int} in my calculator")
	public void I_enter_50(int num)
	{
		System.out.println("I enter "+num+" in my calculator");
	}
	@And("Display {word} in the calculator")
	public void I_enter_word(String symbol)
	{
		System.out.println("Display "+symbol+" in the calculator");
	}

}
