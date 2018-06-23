package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSdelkiPage extends ParentPage
{
    @FindBy(id = "prov_cus_proCustName")
    WebElement proCustName;

    @FindBy(id = "prov_cus_proCustAddress")
    WebElement proCustAddress;

    @FindBy(id = "prov_cus_proCustPhone")
    WebElement proCustPhone;

    @FindBy(id = "prov_cus_proCustIsFl")
    WebElement privatePersonCheckBox;

    @FindBy(name = "add")
    WebElement addButton;


    public EditSdelkiPage(WebDriver driver)
    {
        super(driver);
    }

    public void insertToProCustName(String value)
    {
        uiactions.insertToField(proCustName, value);
    }

    public void insertToProCustAddressField(String value)
    {
        uiactions.insertToField(proCustAddress,value);
    }

    public void insertToProCustPhone(String value)
    {
        uiactions.insertToField(proCustPhone,value);
    }

    public boolean isprivatePersonCheckBoxPresent()
    {
        return uiactions.isElementPresent(privatePersonCheckBox);
    }

    public void checkPrivatePersonCheckBox()
    {
        uiactions.tickCheckBox(privatePersonCheckBox,true);
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
