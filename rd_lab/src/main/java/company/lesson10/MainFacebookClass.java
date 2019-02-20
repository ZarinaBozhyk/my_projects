package company.lesson10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.GooglePage;

import java.util.concurrent.TimeUnit;

public class MainFacebookClass {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zarina_Bozhyk\\IdeaProjects\\rd_lab\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);
        googlePage.inputText("Facebook");
        googlePage.submit();
        googlePage.clickFacebookLink();
        FacebookMainPage facebookMainPage = PageFactory.initElements(driver, FacebookMainPage.class);
        facebookMainPage.userEmailType("badlogin");
        facebookMainPage.userPassType("badpassword");
        facebookMainPage.clickButton();
        FacebookLoginPage facebookLoginPage = PageFactory.initElements(driver, FacebookLoginPage.class);
        facebookLoginPage.printText();
        facebookLoginPage.compareText();
        driver.quit();

    }
}
