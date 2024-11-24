package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PageForm {
    public static Target BUTTON_ITEM_1 = Target.the("item samsung galaxy").locatedBy("//a[contains(text(),'Samsung galaxy s6')]");
    public static Target BUTTON_ITEM_2 = Target.the("item nokia lumia").locatedBy("//a[contains(text(),'Nokia lumia 1520')]");
    public static Target BUTTON_ITEM_3 = Target.the("item nexus 6").locatedBy("//a[contains(text(),'Nexus 6')]");
    public static Target BUTTON_ITEM_4 = Target.the("item macbook pro").locatedBy("//a[contains(text(),'MacBook Pro')]");
    public static Target BUTTON_ADD_TO_CART = Target.the("add to cart buttom").locatedBy("//a[contains(text(),'Add to cart')]");
    public static Target BUTTON_HOME = Target.the("home buttom").locatedBy("//a[@id='nava']");
    public static Target BUTTON_CART = Target.the("add to cart buttom").locatedBy("//a[contains(text(),'Cart')]");
    public static Target LABEL_TOTAL_PRIZE = Target.the("label total prize").locatedBy("//h3[@id='totalp']");
    public static Target BUTTON_NEXT_PAGE = Target.the("button next page").locatedBy("//button[@id='next2']");
    public static String TOTAL_PRICE_XPATH = ("//h3[@id='totalp']");
}
