package tests;

import siteTestAutomation.core.clases.browser.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static Browser browser;

    @BeforeClass
    public static void setUp() { //"79.0.3945.88"
        WebDriverManager.getInstance(ChromeDriver.class).setup("79.0.3945.16");
        browser = new Browser(new ChromeDriver());
        browser.maximizeWindow();
    }

    @AfterClass
    public static void after(){
        browser.quit();
    }
}
