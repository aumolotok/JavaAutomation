package tests;

import siteTestAutomation.core.clases.browser.PageFacility;
import siteTestAutomation.pages.clases.MainPage;
import siteTestAutomation.pages.clases.StartTrialPage;
import siteTestAutomation.utils.StringUtils;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.Assert;


import java.lang.reflect.InvocationTargetException;

@Epic("Wrike trials")
@Feature("Wrike trial mail workflow")
public class MainTrialFlowTests extends BaseTest {

    @Test
    @DisplayName("Check Trial Submit and Tweeter Button")
    @Description("Extremely useful description of testing test")
    @Severity(SeverityLevel.CRITICAL)
    public void checkTrialEmailSendingWorkflow() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, InterruptedException {
        String email = StringUtils.generateString( 10) + "+wpt@wriketask.qaa";

        MainPage main = PageFacility.openPageByPageUrl(MainPage.class, browser);
        main.clickStartTrialHeaderButton();
        StartTrialPage trialPage = main.sentEmailForTrial(email);

        Assert.assertEquals(trialPage.getCurrentUrl(), trialPage.getPatternUrl());
        Assert.assertTrue(trialPage.getMessageWithEmail().contains("email"));

        trialPage.fillSurvey();
        trialPage.submitSurvey();
        trialPage.scrollUp();

        Assert.assertEquals("Thanks for helping us out!", trialPage.getSuccessMessage());

        trialPage.scrollDown();

        Assert.assertEquals("/content/themes/wrike/dist/img/sprite/vector/footer-icons.symbol.svg?v2#twitter", trialPage.footer.tweeterButton.getSourseImage());
        Assert.assertEquals("https://twitter.com/wrike", trialPage.footer.tweeterButton.getInnerLink());
    }
}