package SiteTestAutomation.Elements.Clases;

import SiteTestAutomation.Pages.Interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class Button extends BaseElement {

    public void click(){ getWrappedElement().click();}

    public Button(Page hostPage, By by) {
        super(hostPage, by);
    }

    public Button(Page hostPage, SearchContext parent, By by) {
        super(hostPage, parent, by);
    }
}
