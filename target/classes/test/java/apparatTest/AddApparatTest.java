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

        loginPage.loginUserToTheSystem("Stydent", "909090");
        sparePage.clickOnDictionatiesTab();
        sparePage.clickOnApparatTab();
        apparatPage.isPlusIconPresent();
        apparatPage.clickOnPlusIcon();
        sparePage.insertToApparatNumberField("13");
        sparePage.insertToApparatComment("SpyTest Apparat");
        sparePage.clickOnAddbutton();

    }


}
