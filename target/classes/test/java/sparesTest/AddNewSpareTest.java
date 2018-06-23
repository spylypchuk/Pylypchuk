package sparesTest;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewSpareTest extends ParentTest
{

    public AddNewSpareTest(String browser) {
        super(browser);
    }

    @Test

    public void addNewSpare()
    {
        loginPage.loginUserToTheSystem("Student","909090");
        commonPanelPage.clickOnDictionatiesTab();
        commonPanelPage.clickOnSparesTab();
        sparesPage.isPlusIconPresent();
        sparesPage.clickOnPlusIcon();
        editSparePage.insertToSpareNameField("Плуто́ний-239");
//        editSparePage.selectSpareTypeFromDropDown("53");
        editSparePage.isAddButtonPresent();
        editSparePage.clickOnAddButton();
    }
}
