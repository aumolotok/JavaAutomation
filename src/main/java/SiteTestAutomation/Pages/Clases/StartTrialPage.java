package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import SiteTestAutomation.Elements.Clases.Label;
import SiteTestAutomation.Elements.complexElements.Survey;
import SiteTestAutomation.Elements.complexElements.SurveySuccess;
import SiteTestAutomation.Pages.Clases.PageAnnotations.UrlPattern;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

@UrlPattern(url = "https://www.wrike.com/resend/")
public class StartTrialPage extends BaseIndexPage {

    private Survey survey = initElement(Survey.class, By.xpath(".//form[@name='survey-form']"));

    public SurveySuccess surveySuccess = initElement(SurveySuccess.class, By.xpath(".//div[contains(@class, 'survey-success')]"));

    private Label trialEmail = initElement(Label.class, By.xpath(".//p[@class=\"h4 subtitle\"]"));

    @Step("Get message about success submission")
    public String getSuccessMessage() {
        return surveySuccess.getSuccessMessage();
    }

    @Step("Fill Survey")
    public void fillSurvey() {
        survey.fillQuestions();
    }

    @Step("Submit Survey")
    public void submitSurvey() {
        survey.submit();
        waitToDisappear(survey);
    }

    @Step("Get message")
    public String getMessageWithEmail() {
        return trialEmail.getText();
    }

    public StartTrialPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}
