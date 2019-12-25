package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import SiteTestAutomation.Elements.Clases.StartTrialForm;
import SiteTestAutomation.Elements.complexElements.StickyMenu;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

public class MainPage extends BaseIndexPage {

    public StartTrialForm trialForm = initElement(StartTrialForm.class, By.xpath("//form[contains(@class, \"modal-form-trial__form\")]"));

    public StartTrialPage sentEmailForTrial() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, InterruptedException {
        trialForm.emailInput.sendKeys("abcd+wpt@wriketask.qaa");
        trialForm.sendEmailButton.click();
        return openPage(StartTrialPage.class);
    }

    public MainPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}
