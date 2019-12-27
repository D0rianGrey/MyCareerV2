package local.cistest.vmdcs.admin.pageclasses;

import local.cistest.vmdcs.base.BasePage;
import org.openqa.selenium.WebDriver;

import static local.cistest.vmdcs.utilities.Constants.BASE_URL_ADMIN_DEV;

public class AdminMenuPage extends BasePage {
    public AdminMenuPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebDriver driver;

    private String GROUPS = String.format("xpath=>//a[contains(@href, '%sgroups')]", BASE_URL_ADMIN_DEV);

    public GroupsPage openGroups() {
        elementClick(GROUPS, "Click on 'Group' button");
        return new GroupsPage(driver);
    }
}
