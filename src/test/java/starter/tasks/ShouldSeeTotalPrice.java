package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.questions.GetPriceInfo;

public class ShouldSeeTotalPrice implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(GetPriceInfo.getTotalPrice()).contains("2930")
        );

    }
}
