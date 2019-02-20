package company.lesson12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePage;

import java.util.concurrent.TimeUnit;

public class GoogleTest {
    private WebDriver driver;
    private GooglePage googlePage;

    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver",GoogleTest.class.getResource("chromedriver.exe").getPath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void ckeckCurrentUrl(){
        GooglePage googlePage = new GooglePage(driver);
        String currentUrl = googlePage.getURL();
        Assert.assertEquals("https://www.google.com/", currentUrl);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
