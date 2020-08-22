package step_impl;

import pages.UserMgtPage;
import utils.CucumberUtils;
import utils.SeleniumUtils;

import java.util.Map;

public class UserMgtPageImpl {

    public void fillRegistrationForm(Map<String, String> map){
        UserMgtPage userMgtPage = new UserMgtPage();
        for(String key: map.keySet()) {
            switch (key.toLowerCase()) {
                case "firstname":
                    SeleniumUtils.sendKeys(userMgtPage.firstnameField, map.get(key));
                    break;
                case "lastname":
                    SeleniumUtils.sendKeys(userMgtPage.lastnameField, map.get(key));
                    break;
                case "phone number":
                    SeleniumUtils.sendKeys(userMgtPage.phoneField, map.get(key));
                    break;
                case "email":
                    SeleniumUtils.sendKeys(userMgtPage.emailField, map.get(key));
                    break;
                case "role":
                    userMgtPage.selectRole(map.get(key));
                default:
                    System.out.println("Invalid field type");
            }
            CucumberUtils.logInfo("Entered data: " + map.get(key), false);
        }
        CucumberUtils.logInfo("", true);
    }
}
