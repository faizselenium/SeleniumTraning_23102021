package steps.CucumberProject
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class CucumberProject {

    @Given("^enter the uname$")
    public void enter_the_uname() throws Throwable {
        throw new PendingException();
    }

    @Given("^enter the pass$")
    public void enter_the_pass() throws Throwable {
        throw new PendingException();
    }

    @When("^click on login button$")
    public void click_on_login_button() throws Throwable {
        throw new PendingException();
    }

    @Then("^validate successfully loged in$")
    public void validate_successfully_loged_in() throws Throwable {
        throw new PendingException();
    }

}