package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MainMenu {

    public static final Target MENU_NORTHWIND = Target.the("Menú NorthWind")
            .located(By.xpath("//body[@id=\"s-DashboardPage\"]/child::aside[@id=\"s-sidebar\"]//descendant::span[contains(text(),'Northwind')]"));
    public static final Target MENU_ORDERS = Target.the("Menú Orders").located(By.xpath("//span[contains(text(),'Orders')]"));
}
