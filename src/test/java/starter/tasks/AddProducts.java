package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import starter.ui.PageForm;

public class AddProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PageForm.BUTTON_ITEM_1),
                Click.on(PageForm.BUTTON_ADD_TO_CART),
                Switch.toAlert().andAccept(),
                Click.on(PageForm.BUTTON_HOME),
                Click.on(PageForm.BUTTON_ITEM_2),
                Click.on(PageForm.BUTTON_ADD_TO_CART),
                Switch.toAlert().andAccept(),
                Click.on(PageForm.BUTTON_HOME),
                Click.on(PageForm.BUTTON_ITEM_3),
                Click.on(PageForm.BUTTON_ADD_TO_CART),
                Switch.toAlert().andAccept(),
                Click.on(PageForm.BUTTON_HOME),
                Scroll.to(PageForm.BUTTON_NEXT_PAGE),
                Click.on(PageForm.BUTTON_NEXT_PAGE),
                Click.on(PageForm.BUTTON_ITEM_4),
                Click.on(PageForm.BUTTON_ADD_TO_CART),
                Switch.toAlert().andAccept(),
                Click.on(PageForm.BUTTON_CART)
        );
    }
}
