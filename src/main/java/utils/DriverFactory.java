package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created on 01.09.2017.
 */
public class DriverFactory {
    private static WebDriver driver;

    public static void createDriver(String driverType) {
        switch (driverType) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Ie":
                driver = new InternetExplorerDriver();
                break;
            default:
                driver = new FirefoxDriver();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
