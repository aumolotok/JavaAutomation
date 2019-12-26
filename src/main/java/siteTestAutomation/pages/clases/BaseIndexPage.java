package siteTestAutomation.pages.clases;

import siteTestAutomation.core.clases.browser.Browser;
import siteTestAutomation.elements.complexElements.StickyMenu;
import siteTestAutomation.elements.complexElements.Footer;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

public class BaseIndexPage extends BasePage {

    public Footer footer = initElement(Footer.class, By.xpath(".//div[@class=\"wg-footer\"]"));

    protected StickyMenu stickyMenu = initElement(StickyMenu.class, By.xpath("//*[@class = \"wg-header__sticky-menu\"]"));

    public BaseIndexPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}
