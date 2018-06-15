package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SparePage extends ParentPage
{
    //Dictionaries

    @FindBy(id = "dictionary")
    WebElement Dictionaries;

    @FindBy(id = "apparat")
    WebElement apparat;

    @FindBy(id = "workers")
    WebElement workers;

    @FindBy(id = "spareType")
    WebElement spareType;

    @FindBy(id = "spares")
    WebElement spares;

    @FindBy(id = "prov_cus")
    WebElement storonuSdeloc;

    @FindBy(id = "deal_type")
    WebElement dealType;

    //maintananceTab

    @FindBy(xpath = ".//*[@id='service_apparat']")
    WebElement maintananceTab;



    public SparePage(WebDriver driver)
    {
        super(driver);
    }

    public void clickOnDictionatiesTab(){uiactions.clickToElement(Dictionaries);}

    public void clickOnApparatTab(){uiactions.clickToElement(apparat);}




}
