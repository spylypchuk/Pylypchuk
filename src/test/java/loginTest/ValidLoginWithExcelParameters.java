package loginTest;

import libs.ConfigData;
import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;


public class ValidLoginWithExcelParameters extends ParentTest
{

    public ValidLoginWithExcelParameters(String browser) {
        super(browser);
    }

    @Test
    public void validTestWithExcelParemeters() throws IOException {
        Map dataFromExcelForValidLoginTest = excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"), "validLogOn");
        loginPage.openPageLogin();
        loginPage.insertToLoginField(dataFromExcelForValidLoginTest.get("login").toString());
        loginPage.insertToPasswordField(dataFromExcelForValidLoginTest.get("pass").toString());
        loginPage.clickOnLoginButton();
        checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
        checkAcceptanceCriteria("Title is not expected", homePage.getTitle(), "Учет запчастей");
    }

}
