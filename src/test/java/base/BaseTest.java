package base;

import local.cistest.vmdcs.admin.pageclasses.StartPage;
import local.cistest.vmdcs.utilities.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    public WebDriver driver;
    protected String baseURL;
    protected StartPage startPage;


    @BeforeClass
    @Parameters({"browser"})
    public void commonSetUp(String browser) {
        driver = WebDriverFactory.getInstance().getDriver(browser);
        baseURL = Constants.BASE_URL_ADMIN_DEV;
        driver.get(baseURL);
        startPage = new StartPage(driver);
        startPage.login();
    }

    @AfterClass
    public void commonTearDown() {
        //WebDriverFactory.getInstance().quitDriver();
    }
}
