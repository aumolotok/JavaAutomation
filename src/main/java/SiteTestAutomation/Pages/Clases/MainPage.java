package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import SiteTestAutomation.Elements.Clases.StartTrialForm;
import SiteTestAutomation.Elements.complexElements.StickyMenu;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

public class MainPage extends BasePage {

    public StickyMenu stickyMenu = initElement(StickyMenu.class, By.xpath("//*[@class = \"wg-header__sticky-menu\"]"));

    public StartTrialForm trialForm = initElement(StartTrialForm.class, By.xpath("//form[contains(@class, \"modal-form-trial__form\")]"));



    public MainPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}
