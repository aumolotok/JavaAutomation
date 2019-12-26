package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import SiteTestAutomation.Elements.Clases.Label;
import SiteTestAutomation.Elements.complexElements.Survey;
import SiteTestAutomation.Elements.complexElements.SurveySuccess;
import SiteTestAutomation.Pages.Clases.PageAnnotations.UrlPattern;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

@UrlPattern(url = "https://www.wrike.com/resend/")
public class StartTrialPage extends BaseIndexPage {

    private Survey survey = initElement(Survey.class, By.xpath(".//form[@name='survey-form']"));

    public SurveySuccess surveySuccess = initElement(SurveySuccess.class, By.xpath(".//div[contains(@class, 'survey-success')]"));

    private Label trialEmail = initElement(Label.class, By.xpath(".//p[@class=\"h3 subtitle\"]/b[@class=\"email\"]"));

    public String getSuccessMessage() {
        return surveySuccess.getSuccessMessage();
    }

    public void fillSurvey() {
        survey.fillQuestions();
    }

    public void submitSurvey() {
        survey.submit();
        waitToDisappear(survey);
    }

    public String getTrialMail() {
        return trialEmail.getText();
    }

    public StartTrialPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}
