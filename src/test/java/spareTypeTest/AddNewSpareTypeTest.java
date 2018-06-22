package spareTypeTest;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewSpareTypeTest extends ParentTest
{
    public AddNewSpareTypeTest(String browser) {
        super(browser);
    }

    @Test
    public void addNewSpareType()
    {
        loginPage.loginUserToTheSystem("Student","909090");
        commonPanelPage.clickOnDictionatiesTab();
        commonPanelPage.clickOnSpareTypeTab();
        spareTypePage.isPlusIconPresent();
        spareTypePage.clickOnPlusIcon();
        editSpareTypePage.insertToSpareTypeNameField("Плутоновый стержень");
        editSpareTypePage.isAddButtonPresent();
        editSpareTypePage.clickOnAddButton();
    }

}
