package userinterface.orders;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Orders {

    public static final Target OPTION_NEW_ORDER = Target.the("Menú NorthWind").located(By.xpath("//div[@id='GridDiv']//descendant::i[@class='fa fa-plus-circle text-green']"));
}
