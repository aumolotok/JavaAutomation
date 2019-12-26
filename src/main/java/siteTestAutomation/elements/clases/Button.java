package siteTestAutomation.elements.clases;

import siteTestAutomation.elements.interfaces.LinkElement;
import siteTestAutomation.pages.interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class Button extends BaseElement implements LinkElement {

    public void click() {
        getWrappedElement().click();
    }

    public Button(Page hostPage, By by) {
        super(hostPage, by);
    }

    public Button(Page hostPage, SearchContext parent, By by) {
        super(hostPage, parent, by);
    }

    @Override
    public String getInnerLink() {
        return getWrappedElement().findElement(By.xpath(".//a")).getAttribute("href");
    }
}
