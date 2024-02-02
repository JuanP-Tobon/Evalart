package co.com.bancolombia.ceritification.stepdefinitions;

import co.com.bancolombia.ceritification.tasks.Login;
import co.com.bancolombia.ceritification.tasks.Solve;
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
                Open.url("https://tasks.evalartapp.com/automatization/"));
        OnStage.theActorInTheSpotlight().attemptsTo(Login.on());
    }

    @When("^He performs the solution of problem$")
    public void hePerformsTheSolutionOfProblem() {
        OnStage.theActorInTheSpotlight().attemptsTo(Solve.on());
    }

}
