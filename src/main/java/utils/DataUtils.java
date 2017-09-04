package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created on 01.09.2017.
 */
public class DataUtils {
    private static WebDriver driver;

    public DataUtils(WebDriver driver) {
        this.driver = driver;
    }

    public static Integer getIntByRegExTemplate(WebElement element) {
        String target = element.getText();
        Pattern pattern = Pattern.compile( "[0-9]{1,}" );
        Matcher matcher = pattern.matcher( target );
        return matcher.find() ? Integer.parseInt( matcher.group( 0 ) ) : null;
    }

}
