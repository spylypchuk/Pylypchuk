package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UIActions
{
    WebDriver driver;
    Logger log;
    WebDriverWait webDriverWait;

    public UIActions(WebDriver driver)
    {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        webDriverWait = new WebDriverWait(driver, 20);
    }

    /**
     * method click to the button
     * @param element
     */
    public void clickToElement(WebElement element)
    {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(element));
            element.click();
            log.info("Element was clicked");
        }
        catch (Exception ex)
        {
            log.error("Cannot Click to element" + element);
        }
    }

    /**
     * method insert value to the web element
     * @param element
     * @param element
     */
    public void insertToField(WebElement element,String value)
    {
        try{
        element.clear();
        element.sendKeys(value);
        log.info("Input value to the fields");
    }
    catch (Exception ex)
        {
            log.error("Can't insert value" + value + " ' to an element " + element + ex );
        }
    }

    public void tickCheckBox(WebElement element, Boolean isStatusResult)
    {
        if (((element.isSelected())&&!(isStatusResult))
            || !(element.isSelected())&&(isStatusResult))
        {
            element.click();
        }
    }

    public void selectElementFromDropDown(By element, String textForSelect)
    {
        try
        {
            Select dropDown = new Select(driver.findElement((element)));
            dropDown.selectByVisibleText(textForSelect);
            log.info(textForSelect + "was selected  in DropDown");
        }
        catch (Exception e)
        {
            log.error("Can't work with element");
            Assert.fail("Can't work with element");
        }

    }

    public boolean isElementPresent(WebElement element)
    {

            return element.isDisplayed() && element.isEnabled();



    }


}
