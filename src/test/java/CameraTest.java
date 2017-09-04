import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CameraPage;
import pages.MainPage;
import pages.PhotoAndVideoPage;
import utils.DriverFactory;

/**
 * Created on 01.09.2017.
 */
public class CameraTest extends BaseTest {

    @BeforeMethod
    public void setUpPage() throws Exception {
        mainPage = new MainPage( DriverFactory.getDriver() );
        photoAndVideoPage = new PhotoAndVideoPage( DriverFactory.getDriver() );
        cameraPage = new CameraPage( DriverFactory.getDriver() );
    }

    @Test
    public void testCountProduct() throws Exception {
        mainPage.clickOnPhotoCategory();
        photoAndVideoPage.clickOnCamera();
        cameraPage.clickOnSortingBy();
        cameraPage.clickOnSortingPrice();
        cameraPage.clickOnShowBy();
        cameraPage.clickOnShowTile();
        cameraPage.clickOnCartButton();
        cameraPage.clickOnCartButton();

        Assert.assertEquals( cameraPage.getCountProdukt(),2 );

    }
}
