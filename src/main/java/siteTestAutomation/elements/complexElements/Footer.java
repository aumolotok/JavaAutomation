package siteTestAutomation.elements.complexElements;

import siteTestAutomation.elements.clases.SvgButton;
import siteTestAutomation.pages.interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

import java.lang.reflect.InvocationTargetException;

public class Footer extends ComplexElement {

    public SvgButton tweeterButton = initElement(SvgButton.class, By.xpath(".//*[@class = \"wg-footer__social-list\"]/li[1]"));

    public Footer(Page hostPage, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, by);
    }

    public Footer(Page hostPage, SearchContext parent, By by) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(hostPage, parent, by);
    }
}
