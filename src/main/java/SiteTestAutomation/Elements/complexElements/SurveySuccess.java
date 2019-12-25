package SiteTestAutomation.Elements.complexElements;

import SiteTestAutomation.Elements.Clases.BaseElement;
import SiteTestAutomation.Elements.Clases.Label;
import SiteTestAutomation.Pages.Interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import java.lang.reflect.InvocationTargetException;

public class SurveySuccess extends ComplexElement {

    private Label successLabel = initElement(Label.class, By.xpath(".//h3"));

    public String getSuccessMessage(){
        return successLabel.getText();
    }


    public SurveySuccess(Page hostPage, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, by);
    }

    public SurveySuccess(Page hostPage, SearchContext parent, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, parent, by);
    }
}
