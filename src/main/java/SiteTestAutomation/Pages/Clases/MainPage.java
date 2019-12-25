package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import SiteTestAutomation.Elements.Clases.StartTrialForm;
import SiteTestAutomation.Elements.complexElements.StickyMenu;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

public class MainPage extends BaseIndexPage {

    private StartTrialForm trialForm = initElement(StartTrialForm.class, By.xpath("//form[contains(@class, \"modal-form-trial__form\")]"));

    @Step("Fill trial email and send")
    public StartTrialPage sentEmailForTrial() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, InterruptedException {
        trialForm.emailInput.sendKeys("abcd+wpt@wriketask.qaa");
        trialForm.sendEmailButton.click();
        return openPage(StartTrialPage.class);
    }

    @Step("Click Start Trial Header Button")
    public void clickStartTrialHeaderButton(){
        stickyMenu.startTrial.click();
    }

    public MainPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}
