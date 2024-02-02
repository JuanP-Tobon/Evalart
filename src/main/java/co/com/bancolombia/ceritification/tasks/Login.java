package co.com.bancolombia.ceritification.tasks;

import co.com.bancolombia.ceritification.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("779551").into(LoginPage.USERNAME_FIELD),
                Enter.theValue("10df2f32286b7120MS00LTE1NTk3Nw==30e0c83e6c29f1c3").into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.SEND_BUTTON)
        );
    }

    public static Login on(){
        return Tasks.instrumented(Login.class);
    }
}
