package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private String chromeDriver = "drivers\\chromedriver.exe";
    WebDriver driver;

    public Driver() {
        System.setProperty("webdriver.chrome.driver", this.chromeDriver);
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Driver(String chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
}
