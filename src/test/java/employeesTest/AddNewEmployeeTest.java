package employeesTest;

import org.junit.Test;
import parentTest.ParentTest;

public class AddNewEmployeeTest extends ParentTest
{

    public AddNewEmployeeTest(String browser) {
        super(browser);
    }

    @Test
    public void addNewEmployeeTest()
    {
        loginPage.loginUserToTheSystem("Student","909090");
        sparePage.clickOnDictionatiesTab();
        sparePage.clickOnEmployeesTab();
        employeesPage.isPlusIconPresent();
        employeesPage.clickOnPlusIcon();
        editEmployeePage.insertToWorkerSurnameField("Test");
        editEmployeePage.insertToWorkerNameField("New_Employee");
        editEmployeePage.insertToWorkerMiddleName("Mikhaylovich");
        editEmployeePage.insetToWorkerPhone("+380936666666");
        editEmployeePage.clickOnAddButton();

    }
}
