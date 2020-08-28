package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class Driver {
    private static String propertyPath = "src/test/resources/conf/configuration.properties";
    private static WebDriver driver;

    private static final String sauceUser = ConfigReader.readProperty("sauceUsername", propertyPath);
    private static final String sauceKey = ConfigReader.readProperty("sauceKey", propertyPath);
    private static final String URL = "https://" + sauceUser + ":" + sauceKey + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";


    public static WebDriver getDriver() {
        if (driver == null) {
            if (ConfigReader.readProperty("executeTestLocally", propertyPath).equalsIgnoreCase("false"))
                driver = getRemoteDriver();
            else {
                switch (ConfigReader.readProperty("browser", propertyPath)) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        break;
                    default:
                        System.out.println("Invalid browser type");
                }
            }
        }
        return driver;
    }

    public static void quitDriver(){
        getDriver().quit();
        driver = null;
    }

    public static WebDriver getRemoteDriver(){
        WebDriver driver = null;
        try{
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability("browserName", "chrome");
            capabilities.setCapability("version", ConfigReader.readProperty("browser_version", propertyPath));
            capabilities.setCapability("platform", ConfigReader.readProperty("os", propertyPath));
            driver = new RemoteWebDriver(new URL(URL),capabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return driver;
    }
}
