package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);}

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //find register link and click on it
        driver.findElement(By.linkText("Register")).click();

        //verify text
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Register']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //find register link and click on it
        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.xpath("//label[@for='gender-male']")).click();
        driver.findElement(By.xpath("//input[@data-val-required='First name is required.']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@data-val-required='Last name is required.']")).sendKeys("Smith");
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("1");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("January");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1995");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Prime@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();

        //verify text
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
