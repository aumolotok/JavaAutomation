package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.reflect.InvocationTargetException;


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
    @DisplayName("Check Trial Submit and Tweeter Button")
    @Description("Extremely useful description of testing test ")
    public void clickButton() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, InterruptedException {
        MainPage main = new MainPage(browser);
        main.clickStartTrialHeaderButton();

        StartTrialPage trialPage = main.sentEmailForTrial();
        trialPage.fillSurvey();
        trialPage.submitSurvey();
        trialPage.scrollUp();

        Assert.assertEquals("Thanks for helping us out!" , trialPage.getSuccessMessage());

        trialPage.scrollDown();

        String xlink = trialPage.footer.tweeterButton.getSourseImage();

        Assert.assertEquals("/content/themes/wrike/dist/img/sprite/vector/footer-icons.symbol.svg?v2#twitter", xlink);

        String link = trialPage.footer.tweeterButton.getInnerLink();

        Assert.assertEquals("https://twitter.com/wrike", link);

    }
}