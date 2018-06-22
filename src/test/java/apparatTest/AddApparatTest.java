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
        commonPanelPage.clickOnDictionatiesTab();
        commonPanelPage.clickOnApparatTab();
        apparatPage.isPlusIconPresent();
        apparatPage.clickOnPlusIcon();
        editApparatPage.insertToApparatNumberField("13");
        editApparatPage.insertToApparatComment("SpyTest Apparat");
        editApparatPage.clickOnAddbutton();

    }


}
