import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class testGrid {
    public WebDriver driver = new ChromeDriver();;

    @Test
    public void test() {
        driver.get("https://admin.vmdcs.cistest.local/groups");
        List<WebElement> webElements = driver.findElements(By.xpath("//table[@class=\"dx-datagrid-table dx-datagrid-table-fixed\"]//tr[@class=\"dx-row dx-data-row\" or @class=\"dx-row dx-data-row dx-row-alt\"]"));
        System.out.println(webElements.size());
    }


}
