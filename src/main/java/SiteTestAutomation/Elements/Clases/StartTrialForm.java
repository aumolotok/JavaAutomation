package SiteTestAutomation.Elements.Clases;

import SiteTestAutomation.Elements.complexElements.ComplexElement;
import SiteTestAutomation.Pages.Interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import java.lang.reflect.InvocationTargetException;

public class StartTrialForm extends ComplexElement {

    public Button sendEmailButton = initElement(Button.class, By.xpath(".//button"));

    public Input emailInput = initElement(Input.class, By.xpath(".//input"));

    public StartTrialForm(Page hostPage, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, by);
    }

    public StartTrialForm(Page hostPage, SearchContext parent, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, parent, by);
    }
}
