package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage
{
    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;

    @FindBy(xpath = ".//a[@class='logo']")
    WebElement logo;


    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public boolean isAvatarPresent()
    {
        return uiactions.isElementPresent(avatar);
    }

}
