package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private static WebDriver driver;

    @Before
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        Driver.quitDriver();
    }
}
