package company.lesson10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookMainPage {
    private WebDriver driver;
    public FacebookMainPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath ="//input[@id='email']" )
    private WebElement email;
    @FindBy(xpath = "//input[@id='pass']")
    private WebElement password;
    @FindBy(xpath = "//input[@value='Увійти']")
    private WebElement button;

    public FacebookMainPage userEmailType (String mail){
        email.sendKeys(mail);
        return this;
    }
    public FacebookMainPage userPassType (String pass){
        password.sendKeys(pass);
        return this;
    }

    public FacebookLoginPage clickButton(){
        button.click();
        return new FacebookLoginPage(driver);
    }
    }
