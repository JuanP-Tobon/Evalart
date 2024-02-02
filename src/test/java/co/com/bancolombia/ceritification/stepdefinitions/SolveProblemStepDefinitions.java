package co.com.bancolombia.ceritification.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SolveProblemStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario QA");
    }

    @Given("^the user login into the page$")
    public void theUserLoginIntoThePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.google.com/"));
    }

    @When("^He performs the solution of problem$")
    public void hePerformsTheSolutionOfProblem() {

    }

}
