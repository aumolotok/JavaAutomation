package siteTestAutomation.elements.clases;

import siteTestAutomation.pages.interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class Input extends BaseElement {

    public void sendKeys(String string) {
        getWrappedElement().sendKeys(string);
    }

    public Input(Page hostPage, By by) {
        super(hostPage, by);
    }

    public Input(Page hostPage, SearchContext parent, By by) {
        super(hostPage, parent, by);
    }
}
