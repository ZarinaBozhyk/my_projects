package testsDifferent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TestFacebook {
    @Test
    public void testFaceBook() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://facebook.com/");
        WebElement login = driver.findElement(By.xpath("//input[@id='email']"));
        login.sendKeys("11111");
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("1111");
        password.submit();
        WebElement message = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']"));

    }
}


