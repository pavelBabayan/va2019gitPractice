package LoginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logintest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test1(){
        driver.get("https://www.google.com");
    }

    @Test
    public void test2(){
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @AfterMethod
    public void closing() throws InterruptedException {
        driver.quit();

    }
}
