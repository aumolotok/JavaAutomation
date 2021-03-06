package siteTestAutomation.elements.clases;

import siteTestAutomation.pages.interfaces.Page;
import com.google.common.base.Supplier;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class BaseElement {
    protected SearchContext parent;
    protected Page hostPage;
    protected By locator;

    public By getLocator() {
        return locator;
    }

    public WebElement getWrappedElement() {
        return wrappedElementSupplier.get();
    }

    private Supplier<WebElement> wrappedElementSupplier = () -> parent.findElement(locator);

    public BaseElement(Page hostPage, By by) {
        parent = (SearchContext) hostPage;
        this.hostPage = hostPage;
        locator = by;
    }

    public BaseElement(Page hostPage, SearchContext parent, By by) {
        this.parent = parent;
        this.hostPage = hostPage;
        locator = by;
    }
}
