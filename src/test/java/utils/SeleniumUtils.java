package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SeleniumUtils {

    public static void sleep(long milliseconds){
        try{
            Thread.sleep(milliseconds);
        }catch (InterruptedException e){
            e.printStackTrace();;
        }
    }

    public static void waitForClickability(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForVisibilityOfAll(List<WebElement> elementList){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
    }

    public static void waitForPageToLoad(){
        ExpectedCondition<Boolean> pageLoadCondition = driver -> ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(pageLoadCondition);
    }

    public static void waitForAlert(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public static void click(WebElement element){
        waitForClickability(element);
        highlightElement(element);
        element.click();
    }

    public static void sendKeys(WebElement element, String input){
        waitForVisibility(element);
        highlightElement(element);
        element.sendKeys(input);
    }

    public static String getText(WebElement element){
        waitForVisibility(element);
        highlightElement(element);
        return element.getText();
    }

    public static void moveIntoView(WebElement element){
        try{
            ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        }catch (Exception e){
            e.printStackTrace();
        }
        highlightElement(element);
    }

    public static void highlightElement(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();

        for (int i = 0; i < 2; i++){
            try{
                if(i == 0){
                    executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: black; border:3px solid red; background: yellow");
                }else {
                    sleep(1000);
                    executor.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
