package siteTestAutomation.elements.clases;

import siteTestAutomation.pages.interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class Label extends BaseElement {
    
    public String getText() {
        return getWrappedElement().getText();
    }

    public Label(Page hostPage, By by) {
        super(hostPage, by);
    }

    public Label(Page hostPage, SearchContext parent, By by) {
        super(hostPage, parent, by);
    }
}
