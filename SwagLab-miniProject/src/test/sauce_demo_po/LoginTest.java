package sauce_demo_po;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;
    HeaderPage headerPage;

    @BeforeClass
    public void setUp() {
        // set up the WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

        //initialize  all page objects
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);


    }

    @Test
    public void testValidLogin() {
        // Use LoginPage methods to perform the test
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
       // wait.until(ExpectedConditions.visibilityOf(headerPage.getTitle()));


        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        // Check if the user was redirected to the inventory page
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("User Logging successfully.");
        } else {
            System.out.println("Failed! Expected URL: " + expectedUrl + ", but got: " + actualUrl);
        }

        // Optionally, you can still use an assertion here for reporting purposes in test cases
        Assert.assertEquals(actualUrl, expectedUrl, "The user was not redirected to the inventory page after login.");


    }


    @AfterClass
    public void tearDown() {
        // Close the browser after the test
        driver.quit();
    }
}
