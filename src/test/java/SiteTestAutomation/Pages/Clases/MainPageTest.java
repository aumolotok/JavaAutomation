package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class MainPageTest {

    private static Browser browser;

    @BeforeClass
    public static void setUp(){
        //System.setProperty("webdriver.chrome.driver", "D:\List_of_Jar\chromedriver.exe");
        WebDriverManager.getInstance(ChromeDriver.class).setup("79.0.3945.36");
        browser = new Browser(new ChromeDriver());
        browser.goToUrl("https://www.wrike.com/");
    }


    @Test
    public void clickButton() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        MainPage main = new MainPage(browser);
        main.clickButton();
    }
}