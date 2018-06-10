package loginTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import parentTest.ParentTest;

import java.io.File;

public class ValidTest extends ParentTest
{
    public ValidTest(String browser)
    {
        super(browser);
    }


    @Test
    public void validLoginTest()
    {
        loginPage.openPageLogin();
        loginPage.insertToLoginField("Student");
        loginPage.insertToPasswordField("909090");
        loginPage.clickOnLoginButton();
    }
}


