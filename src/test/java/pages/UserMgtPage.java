package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

public class UserMgtPage {
    public UserMgtPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "Firstname")
    public WebElement firstnameField;

    @FindBy(id = "Lastname")
    public WebElement lastnameField;

    @FindBy(id = "Email")
    public WebElement emailField;

    @FindBy(id = "Phonenumber")
    public WebElement phoneField;

    @FindBy(id = "Select-role")
    public WebElement selectRole;

    @FindBy(id = "submit-btn")
    public WebElement submitBtn;

    @FindBy(id = "login-btn")
    public WebElement logInBtn;

    @FindBy(id = "access-db-btn")
    public WebElement accessDbBtn;

    public void selectRole(String roleType){
        Select select = new Select(selectRole);
        select.selectByVisibleText(roleType);
    }
}
