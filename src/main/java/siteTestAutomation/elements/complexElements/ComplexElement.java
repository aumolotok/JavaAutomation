package siteTestAutomation.elements.complexElements;

import siteTestAutomation.elements.clases.BaseElement;
import siteTestAutomation.pages.interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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

    protected <T extends BaseElement> T initElement(Class<T> clazz, By by) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<T> constr = clazz.getConstructor(Page.class, SearchContext.class, By.class);
        return constr.newInstance(this.hostPage, this, by);
    }
}
