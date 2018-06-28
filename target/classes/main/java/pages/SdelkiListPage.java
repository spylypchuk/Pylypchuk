package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SdelkiListPage extends ParentPage
{
    @FindBy(xpath = ".//i[@class='fa fa-plus']")
    WebElement plusIcon;

    @FindBy(linkText = "SPY_Corp")
    WebElement spyCorpSdelka;


    public SdelkiListPage(WebDriver driver)
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
