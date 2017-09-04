package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created on 01.09.2017.
 */
public class ClickerUtils {
    private WebDriver driver;

    public ClickerUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void elementClickerWebElement(WebElement wElement) {
        try {
            wElement.click();
            Thread.sleep( 100 );
        } catch (WebDriverException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
