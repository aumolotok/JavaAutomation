package siteTestAutomation.elements.clases;

import siteTestAutomation.pages.interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class SvgButton extends Button {

    public String getSourseImage() {
        return getWrappedElement().findElement(By.xpath(".//*[name()='use']")).getAttribute("xlink:href");
    }

    public SvgButton(Page hostPage, By by) {
        super(hostPage, by);
    }

    public SvgButton(Page hostPage, SearchContext parent, By by) {
        super(hostPage, parent, by);
    }
}
