package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {


   String baseUrl = "https://demo.nopcommerce.com/";
   @Before
    public void setUp(){
       openBrowser(baseUrl);
   }

   public void userShouldNavigateToLoginPageSuccessfully(){
       //Find the login link and click on login link
       WebElement loginLink = driver.findElement(By.linkText("Log in"));
       loginLink.click();
       String expectedText = "Welcome, Please Sign In!";
       //find the actual text element and get the text from element
       WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
       String actualText = actualTextElement.getText();
       //verify expected and actual text
       Assert.assertEquals(expectedText, actualText);
   }
   @Test
   public void userShouldLoginSuccessfullyWithValidCredentials(){
       WebElement loginLink = driver.findElement(By.linkText("Log in"));
       loginLink.click();
     //find the email field any type the valid email
     WebElement emailField = driver.findElement(By.id("Email"));
     emailField.sendKeys("primetester@gmail.com");

     //find the password field and type the valid password
       WebElement  passwordField = driver.findElement(By.name("Password"));
       passwordField.sendKeys("123456");

     //click on login button
       WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
       loginButton.click();

     //find the logout and verify text
       String expectedText = "Log out";
       String actualText = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
       Assert.assertEquals(expectedText, actualText);

   }
   @Test
   public void verifyTheErrorMessage() {
       WebElement loginLink = driver.findElement(By.linkText("Log in"));
       loginLink.click();

       //find the email id field and enter email id
       driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");

       //find the password field and enter password
       driver.findElement(By.name("Password")).sendKeys("123");

       //click on login button
       WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
       loginButton.click();

       //verify the text
       String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
               "No customer account found";
       String actualText = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
       Assert.assertEquals(expectedText, actualText);
   }
   @After
    public void tearDown(){
       closeBrowser();



   }
}
