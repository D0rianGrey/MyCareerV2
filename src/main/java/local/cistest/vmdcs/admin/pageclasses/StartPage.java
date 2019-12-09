package local.cistest.vmdcs.admin.pageclasses;

import local.cistest.vmdcs.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StartPage extends BasePage {
    public StartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebDriver driver;
    private String LOGIN_BUTTON = "xpath=>//input[@class=\"action-button\"]";

    public InterviewerFeedbackPage login(){
        javascriptClick(LOGIN_BUTTON,"Click on 'Login' button");
        return new InterviewerFeedbackPage(driver);
    }

}
