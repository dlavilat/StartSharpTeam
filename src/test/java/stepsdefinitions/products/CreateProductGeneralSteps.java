package stepsdefinitions.products;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.LoginUserTask;
import userinterface.MainMenu;
import userinterface.orders.Orders;

import java.util.List;

public class CreateProductGeneralSteps {
    @Before
    public void setup(){
//        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^User login in the StartSharp with$")
    public void User_login_in_the_StartSharp_with(DataTable datos){
        List<List<String>> data = datos.asLists();
        OnStage.theActorCalled("brandon").wasAbleTo(NavigateTo.theStartSharpLoginPage(),
                                                                (LoginUserTask.with(data.get(1).get(0).toString(),
                                                                                    data.get(1).get(1).toString())));
    }

    @Given("the users has entered the orders functionality")
    public void theUsersHasEnteredTheOrdersFunctionality() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(MainMenu.MENU_NORTHWIND),
                Click.on(MainMenu.MENU_ORDERS)
        );
    }
    @Given("enter to create an order")
    public void enterToCreateAnOrder() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(Orders.OPTION_NEW_ORDER)
        );
    }
    @When("fill out the general form Rancho grande, {int}\\/{int}\\/{int}, Andrew Fuller")
    public void fillOutTheGeneralFormRanchoGrandeAndrewFuller(Integer int1, Integer int2, Integer int3) {

    }
    @When("fill out the order detail form chocolade, {int}")
    public void fillOutTheOrderDetailFormChocolade(Integer int1) {

    }
    @When("save the order changes")
    public void saveTheOrderChanges() {

    }
    @Then("the order is listed in the order table")
    public void theOrderIsListedInTheOrderTable() {

    }
}
