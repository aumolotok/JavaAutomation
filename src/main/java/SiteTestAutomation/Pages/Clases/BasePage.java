package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import SiteTestAutomation.Elements.Clases.BaseElement;
import SiteTestAutomation.Pages.Interfaces.Page;
import com.google.common.base.Suppliers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.function.Supplier;

public abstract class BasePage implements Page {
    private Browser browser;

    public Browser getBrowser() {
        return browser;
    }

    public BasePage(Browser browser) {
        this.browser = browser;
    }

    public WebElement findElement(By by) {
        return browser.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return browser.findElements(by);
    }

    private Supplier getSupplier(By by) {
        return () -> browser.findElement(by);
    }

    private Supplier gerMemorizedSupplier(By by) {
        return Suppliers.memoize(() -> browser.findElement(by));
    }

    protected <T extends BaseElement> T initElement(Class<T> clazz, By by) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Page> clazzz = Page.class;
        Constructor<T> constr = clazz.getConstructor(Page.class, By.class);
        return constr.newInstance(this, by);
    }

    protected <T extends BasePage> T openPage(Class<T> pageType) throws InterruptedException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return pageType.getConstructor(browser.getClass()).newInstance(browser);
    }

    public void waitToDisappear(int seconds, BaseElement element) {
        browser.waitForDisappear(seconds, element.getLocator());
    }

    public void waitToDisappear(BaseElement element) {
        browser.waitForDisappear(3, element.getLocator());
    }

    public void scrollToElement(BaseElement element) {
        browser.scrollToElement(element.getWrappedElement());
    }

    public void scrollUp() {
        browser.scrollUp();
    }

    public void scrollDown() {
        browser.scrollDown();
    }
}
