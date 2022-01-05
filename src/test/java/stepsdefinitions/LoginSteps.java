package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.LoginAnswer;
import tasks.LoginUserTask;
import userinterface.MainMenu;

public class LoginSteps {

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("User login in the StartSharp with the user {string} and password {string}")
    public void userLoginInTheStartSharpWithTheUserAndPassword(String user, String password) {

        OnStage.theActorCalled(user).attemptsTo(
                NavigateTo.theStartSharpLoginPage(),
                LoginUserTask.with(user, password)
        );
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Titulo pagina principal", LoginAnswer.validateTitleDashboard(), Matchers.equalTo("Dashboard"))
        );
    }

    @Given("The user goes to the business unit section")
    public void theUserGoesToTheBusinessUnitSection() {

    }
    @When("The user select the option to create a new Business Unit")
    public void theUserSelectTheOptionToCreateANewBusinessUnit() {

    }
    @When("The user fills the form to create a Business Unit with the data")
    public void theUserFillsTheFormToCreateABusinessUnitWithTheData(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("the business unit is created")
    public void theBusinessUnitIsCreated() {

    }
}
