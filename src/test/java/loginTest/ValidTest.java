package loginTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.io.File;

public class ValidTest
{
    WebDriver driver;
    LoginPage loginPage;


    @Before
    public void setUp()
    {
//      File fileFF = new File( "./drivers/chromedriver.exe");
        File fileFF = new File("./ChromeDriver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void validLoginTest()
    {
        loginPage.openPageLogin();
        loginPage.insertToLoginField("Student");
        loginPage.insertToPasswordField("909090");
        loginPage.clickOnLoginButton();
    }

    @After
    public  void tearDown()
    {
        driver.quit();
    }
}
