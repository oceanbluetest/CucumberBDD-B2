package step_definitions;

import io.cucumber.java.en.When;
import pages.UserMgtPage;
import utils.SeleniumUtils;

public class CommonPageTest {
    @When("I click a button {string}")
    public void i_click_a_button(String buttonName) {
        UserMgtPage userMgtPage = new UserMgtPage();
        switch (buttonName.toLowerCase()){
            case "submit": SeleniumUtils.click(userMgtPage.submitBtn);
            break;
            default:
                System.out.println("Invalid button name");
        }
    }
}
