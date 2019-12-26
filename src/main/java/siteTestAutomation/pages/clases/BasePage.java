package siteTestAutomation.pages.clases;

import siteTestAutomation.core.clases.browser.Browser;
import siteTestAutomation.core.clases.browser.PageFacility;
import siteTestAutomation.elements.clases.BaseElement;
import siteTestAutomation.pages.clases.pageAnnotations.UrlPattern;
import siteTestAutomation.pages.interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

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

    protected <T extends BaseElement> T initElement(Class<T> clazz, By by) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<T> constr = clazz.getConstructor(Page.class, By.class);
        return constr.newInstance(this, by);
    }

    protected <T extends BasePage> T openPage(Class<T> pageType) {
        return PageFacility.openPage(pageType, browser);
    }

    public void waitToDisappear(int seconds, BaseElement element) {
        browser.waitForDisappear(seconds, element.getLocator());
    }

    public void waitToDisappear(BaseElement element) {
        waitToDisappear(3, element);
    }

    public void scrollUp() {
        browser.scrollUp();
    }

    public void scrollDown() {
        browser.scrollDown();
    }

    public String getCurrentUrl() {
        return browser.getUrl();
    }

    public String getPatternUrl() {
        return getClass().getAnnotation(UrlPattern.class).url();
    }
}
