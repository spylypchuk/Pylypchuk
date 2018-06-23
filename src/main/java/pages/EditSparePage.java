package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSparePage extends ParentPage
{
    @FindBy(id = "spares_spareName")
    WebElement spareName;

    @FindBy(id = "spares_spareType")
    WebElement spareType;

    @FindBy(name = "add")
    WebElement addButton;

    public EditSparePage(WebDriver driver) {
        super(driver);
    }

    public void insertToSpareNameField(String value)
    {
        uiactions.insertToField(spareName, value);
    }

//    public void selectSpareTypeFromDropDown(String value)
//    {
//        uiactions.selectElementFromDropDown("spareType","");
//    }

    public boolean isAddButtonPresent()
    {
        return uiactions.isElementPresent(addButton);
    }

    public void clickOnAddButton()
    {
        uiactions.clickToElement(addButton);
    }


}
