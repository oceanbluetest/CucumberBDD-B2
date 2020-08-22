package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Driver;
import utils.SeleniumUtils;

public class ClassTaskSteps {

    @Given("I open {string}")
    public void iOpen(String websiteName) {
        switch (websiteName){
            case "youtube": Driver.getDriver().get("https://youtube.com");
            break;
            case "amazon": Driver.getDriver().get("https://amazon.com");
            break;
            case "chase bank": Driver.getDriver().get("https://chase.com");
            break;
            default:
                System.out.println("Invalid website name");
        }
    }

    @Then("I verify title is {string}")
    public void iVerifyTitleIs(String title) {
        Assert.assertEquals(title, Driver.getDriver().getTitle());
    }

    @When("I click {string} button")
    public void iClickButton(String button) {
        String xpath = "";
        switch (button.toLowerCase()){
            case "trending": xpath = "//yt-formatted-string[text()='Trending']";
                break;
            case "best sellers": xpath = "//div[@id='nav-xshop']//a[text()='Best Sellers']";
                break;
            case "atm & branch": xpath = "//a[text()='ATM & branch']";
                break;
            default:
                System.out.println("Invalid button");
        }
        SeleniumUtils.click(Driver.getDriver().findElement(By.xpath(xpath)));
    }
}
