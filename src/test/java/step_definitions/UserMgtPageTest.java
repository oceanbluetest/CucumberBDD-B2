package step_definitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;
import pages.UserMgtPage;
import pojos.User;
import step_impl.UserMgtPageImpl;
import utils.CucumberUtils;
import utils.SeleniumUtils;

import java.util.List;
import java.util.Map;

public class UserMgtPageTest extends UserMgtPageImpl {

    @DataTableType
    public User registerUser(Map<String, String> entry){
        return new User(
                entry.get("firstName"),
                entry.get("lastName"),
                entry.get("phoneNumber"),
                entry.get("email"),
                entry.get("role")
        );
    }

    @And("Creates new users with following data:")
    public void createsNewUsersWithFollowingData(List<User> userList) {
        UserMgtPage.userList = userList;
        createNewUsers(userList);
    }

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


    @Then("Verifies new users are populated in user table")
    public void verifiesNewUsersArePopulatedInUserTable() {
        UserMgtPage userMgtPage = new UserMgtPage();
        int count = 0;
        for (User user: userMgtPage.userList){
            Assert.assertEquals(user.getFirstName(), userMgtPage.tableRows.get(count).findElement(By.xpath(".//td[1]")).getText());
            Assert.assertEquals(user.getLastName(), userMgtPage.tableRows.get(count).findElement(By.xpath(".//td[2]")).getText());
            Assert.assertEquals(user.getPhoneNumber(), userMgtPage.tableRows.get(count).findElement(By.xpath(".//td[3]")).getText());
            Assert.assertEquals(user.getEmail(), userMgtPage.tableRows.get(count).findElement(By.xpath(".//td[4]")).getText());
            Assert.assertEquals(user.getRole(), userMgtPage.tableRows.get(count).findElement(By.xpath(".//td[5]")).getText());
            count++;
        }
    }
}
