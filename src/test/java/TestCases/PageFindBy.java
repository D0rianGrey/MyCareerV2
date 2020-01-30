package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class PageFindBy {
    public WebDriver driver = new ChromeDriver();

    @FindBy(xpath = "")
    public WebElement element;

    @Test
    public void test(){
        driver.get("http://google.com.ua");
        //driver.findElement(By.xpath(element)).sendKeys("page object");
    }

}
