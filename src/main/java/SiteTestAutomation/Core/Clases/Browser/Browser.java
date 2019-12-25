package SiteTestAutomation.Core.Clases.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Browser{
    private WebDriver driver;

    public Browser(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public Browser(){
        this(new ChromeDriver());
    }

    public void goToUrl(String url){
        driver.navigate().to(url);
    }

    public WebElement findElement(By by){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until((driver) -> driver.findElement(by));
    }

    public List<WebElement> findElements(By by) {return driver.findElements(by);}

    public void browserWait(long value,TimeUnit timeDemention){
        WebDriverWait wait = new WebDriverWait(driver, value);
        wait.withTimeout(value, timeDemention);
    }

    public void waitForDisappear(int seconds, By by){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until((driver) -> driver.findElements(by).size() == 0  || driver.findElement(by).isDisplayed() == false);
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollUp(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }



    //window.scrollTo(document.body.scrollHeight,0)
}
