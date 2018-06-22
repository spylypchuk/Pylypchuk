package Suits;


import loginTest.InvalidLoginWithParameters;
import loginTest.InvalidLoginWithParemeterFromExcel;
import loginTest.ValidLoginWithExcelParameters;
import loginTest.ValidTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ValidTest.class,
                InvalidLoginWithParemeterFromExcel.class,
                ValidLoginWithExcelParameters.class,
                InvalidLoginWithParameters.class,

})

public class SuitLogin
{

}
