package sdelkiTest;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewSdelkaTest extends ParentTest
{
    public AddNewSdelkaTest(String browser) {
        super(browser);
    }

    @Test
    public void addNewSdelka()
    {
        loginPage.loginUserToTheSystem("Student","909090");
        commonPanelPage.clickOnDictionatiesTab();
        commonPanelPage.clickOnSdelkiTab();
        sdelkiListPage.isPlusIconPresent();
        sdelkiListPage.clickOnPlusIcon();
        editSdelkiPage.insertToProCustName("SPY_Corp");
        editSdelkiPage.insertToProCustAddressField("Kiev, Unknown street 13");
        editSdelkiPage.insertToProCustPhone("+380931111111");
        editSdelkiPage.isprivatePersonCheckBoxPresent();
        editSdelkiPage.checkPrivatePersonCheckBox();
        editSdelkiPage.isAddButtonPresent();
        editSdelkiPage.clickOnAddButton();

    }
}
