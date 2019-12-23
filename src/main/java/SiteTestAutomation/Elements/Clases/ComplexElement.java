package SiteTestAutomation.Elements.Clases;

import SiteTestAutomation.Pages.Interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComplexElement extends BaseElement implements SearchContext {
    public ComplexElement(Page hostPage, By by) {
        super(hostPage, by);
    }

    public ComplexElement(Page hostPage, SearchContext parent, By by) {
        super(hostPage, parent, by);
    }

    public List<WebElement> findElements(By by) {
        return getWrappedElement().findElements(by);
    }

    public WebElement findElement(By by) {
        return getWrappedElement().findElement(by);
    }
}
