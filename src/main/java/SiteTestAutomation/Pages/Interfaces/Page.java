package SiteTestAutomation.Pages.Interfaces;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import org.openqa.selenium.SearchContext;

public interface Page extends SearchContext {
    Browser getBrowser();
}
