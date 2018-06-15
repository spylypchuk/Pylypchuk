package apparatTest;

import org.junit.Test;
import parentTest.ParentTest;

public class AddApparatTest extends ParentTest
{
    public AddApparatTest(String browser) {
        super(browser);
    }



    @Test
    public void addNewApparatTest()
    {
//
        loginPage.openPageLogin();
        loginPage.insertToLoginField("Student");
        loginPage.insertToPasswordField("909090");
        loginPage.clickOnLoginButton();
        //System.out.println(homePage.isAvatarPresent());
        checkAcceptanceCriteria
                ( "Avatar is not present", homePage.isAvatarPresent(),  true);

        checkAcceptanceCriteria
                ( "Title is not Expected", homePage.getTitle(), "Учет запчастей");
        //
        sparePage.clickOnDictionatiesTab();
        sparePage.clickOnApparatTab();
        apparatPage.isPlusIconPresent();
        apparatPage.clickOnPlusIcon();
        sparePage.insertToApparatNumberField("13");
        sparePage.insertToApparatComment("SpyTest Apparat");
        sparePage.clickOnAddbutton();

    }


}
