package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.PageObj;

import java.time.Duration;

public class TestBase {
    WebDriver driverobj;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\Selenium\\Browser drivers\\geckodriver.exe");
        driverobj = new FirefoxDriver();
        wait = new WebDriverWait(driverobj, Duration.ofSeconds(5));  
    }

    @Test
    public void searchItem() {
        PageObj objsearch = new PageObj(driverobj, wait);
        driverobj.get("https://www.aliexpress.com/?spm=a2g0o.productlist.logo.1.ab1cOi47Oi47nV");
        objsearch.addToCart("laptop");
        objsearch.login("example@gmail.com");
    }

    @AfterClass
    public void tearDown() {
        if (driverobj != null) {
            driverobj.quit();
        }
    }
}
