package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import SiteTestAutomation.Elements.Clases.Button;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

public class MainPage extends BasePage {

    private Button button = initElement(Button.class, By.xpath(" \"//*[@class = \"wg-header__sticky-menu\"]//button[contains(@class,'wg-header__free-trial-button')]\""));

    public void clickButton(){
        button.click();
    }

    public MainPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}
