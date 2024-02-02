package co.com.bancolombia.ceritification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME_FIELD = Target.the("field to enter the username").located(By.name("username"));
    public static final Target PASSWORD_FIELD = Target.the("field to enter the password").located(By.name("password"));
    public static final Target SEND_BUTTON = Target.the("button to send the information").locatedBy("//button[@type='submit']");
}
