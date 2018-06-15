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
        sparePage.clickOnDictionatiesTab();
        sparePage.clickOnApparatTab();
        apparatPage.clickOnPlusIcon();


    }


}
