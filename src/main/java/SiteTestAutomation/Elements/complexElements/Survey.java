package SiteTestAutomation.Elements.complexElements;

import SiteTestAutomation.Elements.Clases.Button;
import SiteTestAutomation.Pages.Interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import java.lang.reflect.InvocationTargetException;

public class Survey extends ComplexElement {

    public Button sendEmail = initElement(Button.class, By.xpath(".//button[contains(@class, 'js-survey-submit')]"));




    public Survey(Page hostPage, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, by);
    }

    public Survey(Page hostPage, SearchContext parent, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, parent, by);
    }
}