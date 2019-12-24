package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import SiteTestAutomation.Elements.complexElements.Survey;
import SiteTestAutomation.Elements.complexElements.SurveySuccess;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

public class StartTrialPage extends BasePage{

    public  Survey survey = initElement(Survey.class, By.xpath("//form[@name='survey-form']"));

    public SurveySuccess surveySuccess = initElement(SurveySuccess.class, By.xpath(".//div[contains(@class, 'survey-success')]"));

    public StartTrialPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}