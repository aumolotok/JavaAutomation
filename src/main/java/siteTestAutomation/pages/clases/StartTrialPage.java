package siteTestAutomation.pages.clases;

import siteTestAutomation.core.clases.browser.Browser;
import siteTestAutomation.elements.clases.Label;
import siteTestAutomation.elements.complexElements.SurveyForm;
import siteTestAutomation.elements.complexElements.SurveySuccess;
import siteTestAutomation.pages.clases.pageAnnotations.UrlPattern;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

@UrlPattern(url = "https://www.wrike.com/resend/")
public class StartTrialPage extends BaseIndexPage {

    private SurveyForm surveyForm = initElement(SurveyForm.class, By.xpath(".//form[@name='survey-form']"));

    public SurveySuccess surveySuccess = initElement(SurveySuccess.class, By.xpath(".//div[contains(@class, 'survey-success')]"));

    private Label trialEmail = initElement(Label.class, By.xpath(".//p[@class=\"h4 subtitle\"]"));

    @Step("Get message about success submission")
    public String getSuccessMessage() {
        return surveySuccess.getSuccessMessage();
    }

    @Step("Fill Survey")
    public void fillSurvey() {
        surveyForm.fillQuestions();
    }

    @Step("Submit Survey")
    public void submitSurvey() {
        surveyForm.submit();
        waitToDisappear(surveyForm);
    }

    @Step("Get message")
    public String getMessageWithEmail() {
        return trialEmail.getText();
    }

    public StartTrialPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}
