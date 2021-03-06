package siteTestAutomation.elements.complexElements;

import siteTestAutomation.elements.clases.Button;
import siteTestAutomation.pages.interfaces.Page;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import java.lang.reflect.InvocationTargetException;

public class SurveyForm extends ComplexElement {

    private Button submitSurvey = initElement(Button.class, By.xpath(".//button[contains(@class, 'js-survey-submit')]"));

    @Step("Fill questions")
    public void fillQuestions() {
        getWrappedElement().findElement(By.xpath(".//button[text() = \"Very interested\"]")).click();
        getWrappedElement().findElement(By.xpath("//button[text() = \"1–5\"]")).click();
        getWrappedElement().findElement(By.xpath("//button[text() = \"Yes\"]")).click();
    }
    @Step("Submit form")
    public void submit() {
        submitSurvey.click();
    }

    public SurveyForm(Page hostPage, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, by);
    }

    public SurveyForm(Page hostPage, SearchContext parent, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, parent, by);
    }
}
