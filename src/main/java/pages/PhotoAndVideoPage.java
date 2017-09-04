package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ClickerUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created on 01.09.2017.
 */
public class PhotoAndVideoPage {
    WebDriver driver;
    ClickerUtils clickerUtils;

    public PhotoAndVideoPage(WebDriver driver) throws Exception {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        PageFactory.initElements( driver, this );
        clickerUtils = new ClickerUtils( driver );
    }

    public final static String CAMERA = ".//*[contains(@href,'cameras')]";
    @FindBy(xpath = CAMERA)
    protected WebElement camera;

    public CameraPage clickOnCamera() throws Exception {
        clickerUtils.elementClickerWebElement( camera );
        return new CameraPage( driver );
    }
}
