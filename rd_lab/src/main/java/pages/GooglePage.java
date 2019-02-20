package pages;

import company.lesson10.FacebookLoginPage;
import company.lesson10.FacebookMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath ="//input[@class='gLFyf gsfi']" )
    private WebElement googleSearchField;
    @FindBy(xpath = "//h3[text()='Facebook — увійдіть або зареєструйтеся']")
    private WebElement facebookLink;

    public GooglePage inputText(String text) {
        googleSearchField.sendKeys("Facebook");
        return this;
    }
    public FacebookMainPage clickFacebookLink(){
        facebookLink.click();
        return new FacebookMainPage(driver);
    }

    public FacebookLoginPage submit(){
        googleSearchField.submit();
        return new FacebookLoginPage(driver);

    }
    public String getURL(){
        String url = driver.getCurrentUrl();
        return url;
    }
}

