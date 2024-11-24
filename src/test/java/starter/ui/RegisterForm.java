package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterForm {

    public static Target BUTTON_SIGNUP_HOME = Target.the("home sign up button").locatedBy("//a[@id='signin2']");
    public static Target INPUT_USERNAME = Target.the("input username").locatedBy("//input[@id='sign-username']");
    public static Target INPUT_PASSWORD = Target.the("input password").locatedBy("//input[@id='sign-password']");
    public static Target BUTTON_SIGNUP = Target.the("input password").locatedBy("//button[normalize-space()='Sign up']");
}
