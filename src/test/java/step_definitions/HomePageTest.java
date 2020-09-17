package step_definitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import step_impl.HomePageImpl;
import utils.Driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import java.util.Arrays;
import java.util.List;

public class HomePageTest extends HomePageImpl {

    @Given("I open home page")
    public void i_open_home_page() {
        Driver.getDriver().get("http://automation.techleadacademy.io");
    }

    @Then("I verifies title is TLA Automation")
    public void i_verifies_title_is_tla_automation() {
        Assert.assertEquals("TLA Automation", Driver.getDriver().getTitle());
    }

    @ParameterType("[^\"]*")
    public List<String> words(String sentence){
        return Arrays.asList(sentence.split(","));
    }

    @Then("Verifies main text contains words such as {words}")
    public void verifiesMainTextContainsWordsSuchAsWebDriverSeleniumCSS(List<String> words) {
        HomePage homePage = new HomePage();
        String mainText = homePage.mainText.getText();
        for (String word: words){
            System.out.println(word);
            assertThat(mainText, containsString(word));
        }
    }
}
