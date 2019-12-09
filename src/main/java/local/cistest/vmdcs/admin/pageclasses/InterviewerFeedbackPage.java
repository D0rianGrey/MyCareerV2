package local.cistest.vmdcs.admin.pageclasses;

import local.cistest.vmdcs.base.BasePage;
import org.openqa.selenium.WebDriver;

public class InterviewerFeedbackPage extends BasePage {
    public InterviewerFeedbackPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebDriver driver;
}
