package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import SiteTestAutomation.Elements.complexElements.StickyMenu;
import SiteTestAutomation.Elements.complexElements.Footer;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

public class BaseIndexPage extends BasePage {

    public Footer footer = initElement(Footer.class, By.xpath(".//div[@class=\"wg-footer\"]"));

    protected StickyMenu stickyMenu = initElement(StickyMenu.class, By.xpath("//*[@class = \"wg-header__sticky-menu\"]"));

    public BaseIndexPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}
