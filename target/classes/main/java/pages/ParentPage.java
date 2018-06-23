package pages;

import libs.UIActions;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParentPage
{
    WebDriver driver;
    Logger log;
    UIActions uiactions;

    @FindBy(tagName = "h1")
   protected  WebElement zagolovok;

    public ParentPage(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        uiactions = new UIActions(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void checkTitle(String title)
    {
        Assert.assertEquals("Title not expected", getTitle(),title);
    }

    public void checkZagolovok(String zagolovokText)
    {
        Assert.assertEquals("Zogolovok is not matched", zagolovok.getText(),zagolovokText);
    }
}
