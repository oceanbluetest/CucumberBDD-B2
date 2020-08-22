package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.UserMgtPage;
import utils.SeleniumUtils;

public class UserMgtPageTest {
    @Given("I navigate to UserMgt page")
    public void i_navigate_to_UserMgt_page() {

    }

    @When("I input {string} as a {string}")
    public void i_input_as_a(String input, String inputField) {
        UserMgtPage userMgtPage = new UserMgtPage();
       switch (inputField.toLowerCase()){
           case "firstname": SeleniumUtils.sendKeys(userMgtPage.firstnameField,input);
           break;
           case "lastname": SeleniumUtils.sendKeys(userMgtPage.lastnameField,input);
               break;
           case "phone number": SeleniumUtils.sendKeys(userMgtPage.phoneField,input);
               break;
           case "email": SeleniumUtils.sendKeys(userMgtPage.emailField,input);
               break;
           case "role": userMgtPage.selectRole(input);
           default:
               System.out.println("Invalid field type");
       }
    }
}
