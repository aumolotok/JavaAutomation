package siteTestAutomation.pages.interfaces;

import siteTestAutomation.core.clases.browser.Browser;
import org.openqa.selenium.SearchContext;

public interface Page extends SearchContext {
    Browser getBrowser();
}
