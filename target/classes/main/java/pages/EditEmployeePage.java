package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditEmployeePage extends ParentPage
{
    @FindBy(id = "workers_workerSurname")
    WebElement workerSurname;

    @FindBy(id = "workers_workerName")
    WebElement workerName;

    @FindBy(id = "workers_workerMiddleName")
    WebElement workerMiddleName;

    @FindBy(id = "workers_workerPhone")
    WebElement workerPhone;

    @FindBy(name = "add")
    WebElement addButton;

    public EditEmployeePage(WebDriver driver)
    {
        super(driver);
    }

    public void insertToWorkerSurnameField(String value)
    {
        uiactions.insertToField(workerSurname, value);
    }

    public void insertToWorkerNameField(String value)
    {
        uiactions.insertToField(workerName, value);
    }

    public void insertToWorkerMiddleName(String value)
    {
        uiactions.insertToField(workerMiddleName, value);
    }

    public void insetToWorkerPhone(String value)
    {
        uiactions.insertToField(workerPhone, value);
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
