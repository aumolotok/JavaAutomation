package siteTestAutomation.pages.clases;

import siteTestAutomation.core.clases.browser.Browser;
import siteTestAutomation.elements.clases.StartTrialForm;
import siteTestAutomation.pages.clases.pageAnnotations.UrlPattern;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

@UrlPattern(url = "https://www.wrike.com/")
public class MainPage extends BaseIndexPage {

    private StartTrialForm trialForm = initElement(StartTrialForm.class, By.xpath("//form[contains(@class, \"modal-form-trial__form\")]"));

    @Step("Fill trial email and send")
    public StartTrialPage sentEmailForTrial(String email) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, InterruptedException {
        trialForm.emailInput.sendKeys(email);
        trialForm.sendEmailButton.click();
        waitToDisappear(trialForm);
        return openPage(StartTrialPage.class);
    }

    @Step("Click Start Trial Header Button")
    public void clickStartTrialHeaderButton() {
        stickyMenu.startTrial.click();
    }

    public MainPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}
