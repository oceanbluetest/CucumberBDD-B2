package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.UserMgtPage;
import step_impl.UserMgtPageImpl;
import utils.CucumberUtils;
import utils.SeleniumUtils;

import java.util.Map;

public class UserMgtPageTest extends UserMgtPageImpl {
    @Given("I navigate to UserMgt page")
    public void i_navigate_to_UserMgt_page() {

    }

    @When("I input {string} as a {string}")
    public void i_input_as_a(String input, String inputField) {
        UserMgtPage userMgtPage = new UserMgtPage();
        LoginPage loginPage = new LoginPage();
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
               break;
           case "username": SeleniumUtils.sendKeys(loginPage.usernameField, input);
               break;
           case "password": SeleniumUtils.sendKeys(loginPage.passwordField, input);
               break;
           default:
               System.out.println("Invalid field type");
       }
        CucumberUtils.logInfo("Input " + input + " in " + inputField + " field", true);
    }

    @Given("I enter following data:")
    public void i_enter_following_data(Map<String, String> dataTable) {
        fillRegistrationForm(dataTable);
    }
}
