package SiteTestAutomation.Core.Clases.Browser;

import SiteTestAutomation.Pages.Clases.BasePage;
import SiteTestAutomation.Pages.Clases.PageAnnotations.UrlPattern;

import java.lang.reflect.InvocationTargetException;

public class PageFacility {
    public static <T extends BasePage> T openPage(Class<T> pageType, Browser browser) throws InterruptedException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        browser.goToUrl(pageType.getAnnotation(UrlPattern.class).url());
        return pageType.getConstructor(browser.getClass()).newInstance(browser);
    }
}
