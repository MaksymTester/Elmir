package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ClickerUtils;
import utils.DataUtils;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created on 01.09.2017.
 */
public class CameraPage {

    private WebDriver driver;
    private ClickerUtils clickerUtils;
    private DataUtils dataUtils;

    public CameraPage(WebDriver driver) throws Exception {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        PageFactory.initElements( driver, this );
        clickerUtils = new ClickerUtils( driver );
        dataUtils = new DataUtils( driver );
    }

    private final static String SORTING_BY = ".//*[contains(text(),'Сортировать по:')]/following-sibling::div/span";
    private final static String SORTING_PRICE = "(.//*[contains(text(),'возрастанию цены')])[1]";
    private final static String SHOW_BY = ".//*[contains(text(),'Показывать:')]/following-sibling::div/span";
    private final static String SHOW_TILE = ".//*[contains(text(),'плиткой')]";

    private final static String CART_BUTTON = "(//ul[@id='vitrina-tovars']//a[contains(@onclick,'btn_buy')])[1]";
    private final static String CART_POPUP = "(//ul[@id='vitrina-tovars'])[1]//*[contains(@href,'/order.html')]/parent::span";


    @FindBy(xpath = SORTING_BY)
    protected WebElement sortingBy;

    @FindBy(xpath = SORTING_PRICE)
    protected WebElement sortingPrice;

    @FindBy(xpath = CART_BUTTON)
    protected WebElement cartButton;

    @FindBy(xpath = CART_POPUP)
    protected WebElement cartPopup;

    @FindBy(xpath = SHOW_BY)
    protected WebElement showBy;

    @FindBy(xpath = SHOW_TILE)
    protected WebElement showTile;

    public void clickOnSortingBy() {
        clickerUtils.elementClickerWebElement( sortingBy );
    }

    public void clickOnSortingPrice() {
        clickerUtils.elementClickerWebElement( sortingPrice );
    }

    public void clickOnCartButton() {
        clickerUtils.elementClickerWebElement( cartButton );
    }

    public void clickOnShowBy() {
        clickerUtils.elementClickerWebElement( showBy );
    }

    public void clickOnShowTile() {
        clickerUtils.elementClickerWebElement( showTile );
    }

    public int getCountProdukt() throws InterruptedException {
        return dataUtils.getIntByRegExTemplate( cartPopup );

    }

}
