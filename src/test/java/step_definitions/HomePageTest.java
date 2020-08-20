package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.Driver;

public class HomePageTest {
    @Given("I open home page")
    public void i_open_home_page() {
        Driver.getDriver().get("http://automation.techleadacademy.io");
    }

    @Then("I verifies title is TLA Automation")
    public void i_verifies_title_is_tla_automation() {
        Assert.assertEquals("TLA Automation", Driver.getDriver().getTitle());
    }
}
