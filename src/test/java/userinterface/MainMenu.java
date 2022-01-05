package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MainMenu {

    public static final Target MENU_NORTHWIND = Target.the("Menú NorthWind").located(By.xpath("//span[contains(text(),'Northwind')]"));
}
