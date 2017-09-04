

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CameraPage;
import pages.MainPage;
import pages.PhotoAndVideoPage;
import utils.Configuration;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created on 01.09.2017.
 */
public class BaseTest extends Configuration {
    MainPage mainPage;
    PhotoAndVideoPage photoAndVideoPage;
    CameraPage cameraPage;

    @BeforeMethod
    public void setUp() throws Exception {
        DriverFactory.createDriver( browserType );
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        DriverFactory.getDriver().get( url );
    }

    @AfterMethod
    public void tearDown() throws Exception {
        utils.DriverFactory.getDriver().quit();
    }
}

