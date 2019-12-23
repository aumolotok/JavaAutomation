package SiteTestAutomation.Elements.Clases;

import SiteTestAutomation.Pages.Interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class StartTrialForm extends ComplexElement {






    public StartTrialForm(Page hostPage, By by) {
        super(hostPage, by);
    }

    public StartTrialForm(Page hostPage, SearchContext parent, By by) {
        super(hostPage, parent, by);
    }
}
