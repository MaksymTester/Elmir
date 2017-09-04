package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ClickerUtils;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created on 01.09.2017.
 */
public class MainPage {
    WebDriver driver;
    ClickerUtils clickerUtils;

    public MainPage(WebDriver driver) throws Exception {

        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        PageFactory.initElements( driver, this );
        clickerUtils = new ClickerUtils( driver );
    }

    public final static String PHOTO_AND_VIDEO_CATEGORY = ".//*[contains(@href,'photo_and_video')]";
    @FindBy(xpath = PHOTO_AND_VIDEO_CATEGORY)
    protected WebElement photoAndVideoCategory;

    public PhotoAndVideoPage clickOnPhotoCategory() throws Exception {
        clickerUtils.elementClickerWebElement( photoAndVideoCategory );
        return new PhotoAndVideoPage( driver );
    }


}
