package tasks.menu;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.MainMenu;

public class OpcionOrdersTask implements Task {

    public static Performable menuOrders(){
        return Tasks.instrumented(OpcionOrdersTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainMenu.MENU_NORTHWIND).afterWaitingUntilEnabled(),
                Click.on(MainMenu.MENU_ORDERS).afterWaitingUntilEnabled()
        );
    }
}
