package SiteTestAutomation.Core.Clases.Browser;

import SiteTestAutomation.Pages.Clases.BasePage;
import SiteTestAutomation.Pages.Clases.PageAnnotations.UrlPattern;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Browser {
    private WebDriver driver;

    public Browser(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void goToUrl(String url) {
        driver.navigate().to(url);
    }

    public WebElement findElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until((driver) -> driver.findElement(by));
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public void waitForDisappear(int seconds, By by) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until((driver) -> driver.findElements(by).size() == 0 || driver.findElement(by).isDisplayed() == false);
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public void quit(){
        driver.quit();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public <T extends BasePage> T openPage(Class<T> pageType) throws InterruptedException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        goToUrl(pageType.getAnnotation(UrlPattern.class).url());
        return pageType.getConstructor(getClass()).newInstance(this);
    }

}
