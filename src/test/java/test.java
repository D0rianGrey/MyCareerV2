import base.BaseTest;
import local.cistest.vmdcs.admin.pageclasses.AdminMenuPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test extends BaseTest {

    @Test
    public void test() {
        AdminMenuPage adminMenuPage = new AdminMenuPage(driver);
        adminMenuPage.openGroups();
    }
}
