package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditApparatPage extends ParentPage
{
    @FindBy(id = "apparat_apparatNumber")
    WebElement apparatNumber;

    @FindBy(id = "apparat_apparatComment")
    WebElement apparatComment;

    @FindBy(name = "add")
    WebElement addButton;

    public EditApparatPage(WebDriver driver)
    {
        super(driver);
    }   public void insertToApparatNumberField(String value)
{
    uiactions.insertToField(apparatNumber, value);
}

    public void insertToApparatComment(String value)
    {
        uiactions.insertToField(apparatComment, value);
    }

    public void clickOnAddbutton()
    {
        uiactions.clickToElement(addButton);
    }




}
