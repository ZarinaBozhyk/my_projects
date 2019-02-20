package company.lesson10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPage {

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    @FindBy(xpath ="//div[@class='_4rbf _53ij']" )
    private WebElement actual_errorMessage;
    private String expected_errorMessage = "Указана електронна адреса (або номер телефону) не пов'язана з жодним обліковим записом. ";

    public String getActual_errorMessage() {
       return  actual_errorMessage.getAttribute("innerHTML");
    }
    public void printText() {
        System.out.println(getActual_errorMessage());
    }
    public void compareText() {
        if (getActual_errorMessage().contains(expected_errorMessage)) {
           System.out.println("Test pass");
        } else {
            System.out.println("Test failed");
        }
    }

    public String getErrorText(){
        return actual_errorMessage.getText();
    }

    public void close() {
        driver.quit();
    }
}
