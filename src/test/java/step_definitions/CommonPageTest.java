package step_definitions;

import io.cucumber.java.en.When;
import pages.UserMgtPage;
import step_impl.CommonPageImpl;
import utils.Driver;
import utils.SeleniumUtils;

public class CommonPageTest extends CommonPageImpl {

    @When("I click a button {string}")
    public void i_click_a_button(String buttonName) {
        UserMgtPage userMgtPage = new UserMgtPage();
        String mainWindowID = Driver.getDriver().getWindowHandle();

        switch (buttonName.toLowerCase()){
            case "submit": SeleniumUtils.click(userMgtPage.submitBtn);
                break;
            case "login": SeleniumUtils.click(userMgtPage.logInBtn);
                switchToWindow(mainWindowID);
                break;
            case "access db": SeleniumUtils.click(userMgtPage.accessDbBtn);
                switchToWindow(mainWindowID);
                break;
            default:
                System.out.println("Invalid button name");
        }
    }
}
