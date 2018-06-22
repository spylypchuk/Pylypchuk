package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeesPage extends ParentPage
{
    @FindBy(xpath = ".//i[@class='fa fa-plus']")
    WebElement plusIcon;

    public EmployeesPage(WebDriver driver)
    {
        super(driver);
    }
    public boolean isPlusIconPresent()
    {
        return uiactions.isElementPresent(plusIcon);
    }

    public void clickOnPlusIcon()
    {
        uiactions.clickToElement(plusIcon);
    }

}
