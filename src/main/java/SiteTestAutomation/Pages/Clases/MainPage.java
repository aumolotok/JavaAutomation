package SiteTestAutomation.Pages.Clases;

import SiteTestAutomation.Core.Clases.Browser.Browser;
import SiteTestAutomation.Elements.Clases.Button;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

public class MainPage extends BasePage {

    private Button button = initElement(Button.class, By.xpath(""));

    public void clickButton(){
        button.click();
    }

    public MainPage(Browser browser) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        super(browser);
    }
}
