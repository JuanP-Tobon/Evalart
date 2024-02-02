package co.com.bancolombia.ceritification.tasks;

import co.com.bancolombia.ceritification.userinterfaces.ProblemsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Solve implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String problemOne="";
        String problemTwo="";

        for (int i = 0; i < 10; i++) {
            problemOne = Text.of(ProblemsPage.OPERATION_1).viewedBy(actor).asString();
            problemTwo = Text.of(ProblemsPage.OPERATION_2).viewedBy(actor).asString().replace("=", "").replace("?", "");

            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            try {
                Object operationObjectOne = engine.eval(problemOne);
                Object operationObjectTwo = engine.eval(problemTwo);

                actor.attemptsTo(
                        SelectFromOptions.byValue(operationObjectOne.toString()).from(ProblemsPage.RESULT_OPERATION_1),
                        Click.on(ProblemsPage.RESULT_OPERATION_2.of(operationObjectTwo.toString().replace(".","").replace("E10",""))),
                        Click.on(ProblemsPage.SEND_BUTTON)
                );
            } catch (ScriptException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Solve on(){
        return Tasks.instrumented(Solve.class);
    }
}
