package lesson12;


import driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;

import java.util.concurrent.TimeUnit;

public class GoogleTest {
    private WebDriver driver;
    private GooglePage googlePage;

    @Before
    public void setUp(){
        driver = new Driver().getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

//    @Test
//    public void checkLogoTitle() {
//        GooglePage googlePage = new GooglePage(driver);
//        String logo = googlePage.checkLogo();
//        Assert.assertEquals("Google", logo);
//    }
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
