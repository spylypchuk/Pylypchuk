package loginTest;

import libs.ConfigData;
import libs.SpreadSheetData;
import org.junit.Test;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;


public class InvalidLoginWithParemeterFromExcel extends ParentTest
{
    String login, pass;

    public InvalidLoginWithParemeterFromExcel(String browser, String login, String pass)
    {
        super(browser);
        this.login = login;
        this.pass = pass;
    }

    @Parameterized.Parameters
    public static Collection testData()throws IOException
    {
        InputStream spreadsheet = new FileInputStream(ConfigData.getCfgValue("DATA_FILE_PATH") + "testDataSuit.xls");
        return new SpreadSheetData(spreadsheet, "InvalidLogOn").getData();
    }

    @Test
    public void invalidLogIn()
    {
        loginPage.loginUserToTheSystem(login,pass);
        checkAcceptanceCriteria("Title not match", loginPage.getTitle(), "Account of spare:Авторизация");
    }
}
