package siteTestAutomation.core.clases.browser;

import siteTestAutomation.pages.clases.BasePage;
import siteTestAutomation.pages.clases.pageAnnotations.UrlPattern;

import java.lang.reflect.InvocationTargetException;

public class PageFacility {
    public static <T extends BasePage> T openPage(Class<T> pageType, Browser browser) {
        try{
            return pageType.getConstructor(browser.getClass()).newInstance(browser);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Constructor was not found");
        }
        return null;
    }

    public static <T extends BasePage> T openPageByPageUrl(Class<T> pageType, Browser browser) throws  NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        browser.goToUrl(pageType.getAnnotation(UrlPattern.class).url());
        return pageType.getConstructor(browser.getClass()).newInstance(browser);
    }
}
