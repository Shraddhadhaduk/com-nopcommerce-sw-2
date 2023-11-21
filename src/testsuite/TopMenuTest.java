package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);}

       @Test
        public void userShouldNavigateToComputerPageSuccessfully(){
            //find the computer page and click on it
           driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")).click();

           //verify text
           String expectedText = "Computers";
           String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Computers']")).getText();
           Assert.assertEquals(expectedText, actualText);

        }

        @Test
        public void userShouldNavigateToElectronicsPageSuccessfully(){
        //find the electronic page and click on it
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")).click();

        //verify text
        String expectedText = "Electronics";
        //verify text
        String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Electronics']")).getText();
        Assert.assertEquals(expectedText, actualText);
        }
        @Test
        public void userShouldNavigateToApparelPageSuccessfully(){
        //find the apparel page and click on it
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")).click();

        //Verify text
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Apparel']")).getText();
        Assert.assertEquals(expectedText, actualText);

        }

        @Test
        public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //find the digital downloads page and click on it
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")).click();

        //verify test
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Digital downloads']")).getText();
        Assert.assertEquals(expectedText, actualText);
        }

        @Test
        public void userShouldNavigateToBooksPageSuccessfully(){
            //find the Books page and click on it
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")).click();

            //verify test
            String expectedText = "Books";
            String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Books']")).getText();
            Assert.assertEquals(expectedText, actualText);
        }

        @Test
        public void userShouldNavigateToJewelryPageSuccessfully(){
            //find the Jewelry page and click on it
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")).click();

            //verify test
            String expectedText = "Jewelry";
            String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Jewelry']")).getText();
            Assert.assertEquals(expectedText, actualText);
        }

        @Test
        public void userShouldNavigateToGiftCardsPageSuccessfully(){
            //find the Gift Cards page and click on it
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")).click();

            //verify test
            String expectedText = "Gift Cards";
            String actualText = driver.findElement(By.xpath("//h1[normalize-space()='Gift Cards']")).getText();
            Assert.assertEquals(expectedText, actualText);
        }

        @After
        public void tearDown(){
          closeBrowser();
        }




}