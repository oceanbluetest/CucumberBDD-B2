package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonPage {
    public CommonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static final String CURRENT_DATETIME = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"));


}
