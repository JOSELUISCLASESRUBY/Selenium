package Selenium;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Tests {
    DriverManager driverManager;
    WebDriver driver;

    @Test
    public void navigateToGoogleTest(){
        driverManager=DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver=driverManager.getWebDriver();
        driver.get("http://wwww.google.com");
        Assert.assertEquals("Google",driver.getTitle());
    }
}
