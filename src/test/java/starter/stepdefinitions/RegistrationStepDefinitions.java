package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import starter.tasks.AddProducts;
import starter.tasks.RegisterUser;
import starter.tasks.ShouldSeeTotalPrice;

import java.util.List;

public class RegistrationStepDefinitions {

    String expectedUserName = "";
    String expectedPassword = "";

    @Given("{actor} enter to the web page")
    public void enterToTheWebPage(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.demoblaze.com/")
        );
    }

    @When("{actor} sends the required information to sign up")
    public void sendsRequiredInformationToSignUp(Actor actor, DataTable userInfo) {

        List<List<String>> rows = userInfo.asLists(String.class);

        for (List<String> columns : rows) {
            expectedUserName = columns.get(0);
            expectedPassword = columns.get(1);
        }
        actor.attemptsTo(
                new RegisterUser(expectedUserName, expectedPassword)
        );
    }

    @When("{actor} adds to the cart several items")
    public void addsToTheCartSeveralItems(Actor actor) {
        actor.attemptsTo(
                new AddProducts()
        );
    }

    @Then("{actor} should can see the total price of the items")
    public void shouldCanSeeTheTotalPriceOfTheItems(Actor actor) {
        actor.attemptsTo(
                new ShouldSeeTotalPrice()
        );
    }
}
