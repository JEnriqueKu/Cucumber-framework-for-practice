package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public static void setupChromeDriver() {
        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    /////////////
    public void navigateTo(String URL){
        driver.get(URL);
    }

    public void write (String locator, String text){
        Find(locator).sendKeys(text);
    }

    public void click (String locator){
        Find(locator).click();
    }

    public List <WebElement> allWebElements(String locator){
        return driver.findElements(By.className(locator));
    }
}
