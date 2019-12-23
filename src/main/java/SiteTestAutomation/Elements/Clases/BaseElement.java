package SiteTestAutomation.Elements.Clases;

import SiteTestAutomation.Pages.Interfaces.Page;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class BaseElement {
    protected SearchContext parent;
    protected Page hostPage;
    protected By locator;

    protected WebElement getWrappedElement(){
        return wrappedElementSupplier.get();
    };

    private Supplier<WebElement> wrappedElementSupplier = () -> parent.findElement(locator);

    public BaseElement(Page hostPage, By by){
        parent = (SearchContext)hostPage;
        locator = by;
    }

    public BaseElement(Page hostPage, SearchContext parent, By by){
        this.parent = parent;
        this.hostPage = hostPage;
        locator = by;
    }

    private Supplier getSupplier(By by){
        return () -> parent.findElement(by);
    }

    private Supplier getMemorizedSupplier(By by) {
        return Suppliers.memoize(() -> parent.findElement(by));
    }
}
