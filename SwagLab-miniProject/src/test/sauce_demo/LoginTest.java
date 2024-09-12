package sauce_demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // set up the WebDriver
        WebDriverManager.chromedriver().setup();
        // Set up the WebDriver (Chrome in this case)
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to the login page (Assuming the base URL is known)
        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void testLogin() {
        // Locate the username input field and enter "standard_user"
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        // Locate the password input field and enter "secret_sauce"
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Locate the login button and click it
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Add an assertion to verify successful login, based on a valid page element after login
        // For example, checking if a specific element (like the product page) is displayed
        WebElement productsTitle = driver.findElement(By.className("title"));
        Assert.assertTrue(productsTitle.isDisplayed(), "Login failed, products page not displayed.");
        System.out.println("Login successful!");

    }

    @AfterClass
    public void tearDown() {
        // Close the browser after the test
        driver.quit();
    }
}

