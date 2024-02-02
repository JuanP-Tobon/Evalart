package co.com.bancolombia.ceritification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProblemsPage {
    public static final Target OPERATION_1 = Target.the("text with problem 1").locatedBy("(//p[@class='text-center text-xl font-bold'])[1]");
    public static final Target OPERATION_2 = Target.the("text with problem 1").locatedBy("(//p[@class='text-center text-xl font-bold'])[2]");
    public static final Target RESULT_OPERATION_1 = Target.the("Select answer from operation 1").located(By.name("select"));
    public static final Target RESULT_OPERATION_2 = Target.the("Select answer from operation 2").locatedBy("//input[@value='{0}']");
    public static final Target SEND_BUTTON = Target.the("button to send the result").locatedBy("//button[@type='submit']");
}
