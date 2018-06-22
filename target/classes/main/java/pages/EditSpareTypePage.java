package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSpareTypePage extends ParentPage
{
    @FindBy(id = "spareType_spareTypeName")
    WebElement spareTypeName;

    @FindBy(name = "add")
    WebElement addButton;

    public EditSpareTypePage(WebDriver driver)
    {
        super(driver);
    }

    public void insertToSpareTypeNameField(String value)
    {
        uiactions.insertToField(spareTypeName, value);
    }

    public boolean isAddButtonPresent()
    {
        return uiactions.isElementPresent(addButton);
    }

    public void clickOnAddButton()
    {
        uiactions.clickToElement(addButton);
    }

}
