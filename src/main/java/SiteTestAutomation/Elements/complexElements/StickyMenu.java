package SiteTestAutomation.Elements.complexElements;

import SiteTestAutomation.Elements.Clases.Button;
import SiteTestAutomation.Pages.Interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import java.lang.reflect.InvocationTargetException;

public class StickyMenu extends ComplexElement {

    public Button startTrial = initElement(Button.class, By.xpath(".//button[contains(@class,'wg-header__free-trial-button')]"));

    public StickyMenu(Page hostPage, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, by);
    }

    public StickyMenu(Page hostPage, SearchContext parent, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, parent, by);
    }
}
