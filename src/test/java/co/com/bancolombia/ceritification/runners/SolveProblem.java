package co.com.bancolombia.ceritification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/solve_problem.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.bancolombia.ceritification.stepdefinitions"
)
public class SolveProblem {
}
