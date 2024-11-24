package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.RegisterForm;

public class RegisterUser implements Task {
    private final String expectedUserName;
    private final String expectedPassword;

    public RegisterUser(String expectedUserName, String expectedPassword) {
        this.expectedUserName = expectedUserName;
        this.expectedPassword = expectedPassword;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterForm.BUTTON_SIGNUP_HOME),
                Enter.theValue(expectedUserName).into(RegisterForm.INPUT_USERNAME),
                Enter.theValue(expectedPassword).into(RegisterForm.INPUT_PASSWORD),
                Click.on(RegisterForm.BUTTON_SIGNUP)
        );

    }
}
