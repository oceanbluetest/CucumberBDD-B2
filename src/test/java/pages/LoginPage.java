package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import step_impl.LoginPageImpl;
import utils.Driver;
import utils.SeleniumUtils;

public class LoginPage extends LoginPageImpl {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement usernameField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;

    public void logIn(String username, String password){
        SeleniumUtils.sendKeys(usernameField, username);
        SeleniumUtils.sendKeys(passwordField, password);
        SeleniumUtils.click(loginBtn);
    }
}
