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
        try
        {
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

    public void selectDropDownElemByValue(WebElement webElement, String value){
        webElement.findElement(By.xpath(".//option[contains(text(),'" + value + "')]")).click();
    }


    public boolean selectItemInDropDownByVisibleText(WebElement elementDD, String textForSelect){
        try {
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByVisibleText(textForSelect);
            log.info(textForSelect + " was selected in DD");
            return true;
        } catch (Exception e) {
            log.error("Can not work with element");
            Assert.fail("Can not work with element");
            return false;
        }
    }

    public boolean isElementPresent(WebElement element)
    {
        try
        {
            return element.isDisplayed() && element.isEnabled();
        }
        catch (Exception ex)
        {
            return false;
        }

    }

    public String getTextFromElement(WebElement element){
        try {
            return element.getText();
        } catch (Exception e) {
            log.error("Something went wrong");
            throw new AssertionError("getTextFromElement: Ooops!");
        }
    }


    public String getCurrentUrl(){
        try {
            return driver.getCurrentUrl();
        } catch (Exception e) {
            log.error("Can't get current url");
            throw new AssertionError("getCurrentUrl: Ooops!");
        }
    }






}
