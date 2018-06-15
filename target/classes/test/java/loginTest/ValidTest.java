package loginTest;

import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;
import parentTest.ParentTest;


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
        //System.out.println(homePage.isAvatarPresent());
        checkAcceptanceCriteria
               ( "Avatar is not present", homePage.isAvatarPresent(),  true);

        checkAcceptanceCriteria
                ( "Title is not Expected", homePage.getTitle(), "Учет запчастей");
    }
}


