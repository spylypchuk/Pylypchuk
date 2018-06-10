package pages;

import libs.ConfigData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage
{

   /**
    * can be used String also
    *
    */



//   By LoginFieldName = By.name("_username");
//   By PasswordInputId = By.id("password");
//   By SubmitButtonXpath = By.xpath(".//button[@type='submit']");
   By RemindPasswordLink = By.linkText(".//a[text()='Напомнить пароль']");
   By RegistrationLink = By.linkText(".//a[@class and text()='Зарегистрироваться']");


   @FindBy(name ="_username")
   WebElement  LoginFieldName;

   @FindBy(id = "password")
   WebElement PasswordInputId;

   @FindBy(xpath = ".//button[@type='submit']" )
   WebElement SubmitButtonXpath;


   public LoginPage(WebDriver driver)
   {
      super(driver);
   }


//   public  void openPage(String url)
//   {
//      driver.get(url);
//   }

   public  void openPageLogin()
   {
      try
      {
         driver.get(ConfigData.getCfgValue("base_url") + "/login");
         log.info("Page login was opened");
      }
      catch(Exception e)
      {
         log.error("Can't open URL");
         Assert.fail("Can't open URL");
      }
   }

   public void insertToLoginField(String value)
   {
      uiactions.insertToField(LoginFieldName, value);
   }

   public void insertToPasswordField(String value)
   {
      uiactions.insertToField(PasswordInputId, value);
   }

   public void clickOnLoginButton()
   {
      uiactions.clickToElement(SubmitButtonXpath);
   }

   public void LoginUser(String login, String password)
   {
      insertToLoginField(login);
      insertToPasswordField(password);
      clickOnLoginButton();
   }





}
