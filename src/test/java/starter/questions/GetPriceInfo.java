package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.ui.PageForm;

public class GetPriceInfo {

    public static Question<String> getTotalPrice() {
        return Question.about("total price of items").answeredBy(
                actor -> BrowseTheWeb.as(actor).textOf(PageForm.TOTAL_PRICE_XPATH)
        );
    }
}
