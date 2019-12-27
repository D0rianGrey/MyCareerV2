import base.BaseTest;
import local.cistest.vmdcs.admin.pageclasses.AdminMenuPage;
import local.cistest.vmdcs.admin.pageclasses.StartPage;
import org.testng.annotations.Test;

public class test extends BaseTest {

    @Test
    public void test() {
        AdminMenuPage adminMenuPage = new AdminMenuPage(driver);
        adminMenuPage.openGroups();
    }

}
