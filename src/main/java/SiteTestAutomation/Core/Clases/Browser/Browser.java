package SiteTestAutomation.Core.Clases.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Browser{
    private WebDriver driver;

    public Browser(WebDriver driver){
        this.driver = driver;
    }

    public Browser(){
        this.driver = new ChromeDriver();
    }

    public void goToUrl(String url){
        driver.navigate().to(url);
    }

    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by) {return driver.findElements(by);}
}
