package sauce_demo_po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

    // Constructor to initialize elements
    public InventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Inventory list container
    @FindBy(className = "inventory_list")
    private WebElement inventoryList;

    // First inventory item
    @FindBy(xpath = "//div[@class='inventory_item'][1]//a[@id='item_4_title_link']")
    private WebElement firstItemTitleLink;

    @FindBy(xpath = "//div[@class='inventory_item'][1]//div[@class='inventory_item_name']")
    private WebElement firstItemName;

    @FindBy(xpath = "//div[@class='inventory_item'][1]//div[@class='inventory_item_desc']")
    private WebElement firstItemDescription;

    @FindBy(xpath = "//div[@class='inventory_item'][1]//div[@class='inventory_item_price']")
    private WebElement firstItemPrice;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement firstItemAddToCartButton;

    // Second inventory item
    @FindBy(xpath = "//div[@class='inventory_item'][2]//a[@id='item_0_title_link']")
    private WebElement secondItemTitleLink;

    @FindBy(xpath = "//div[@class='inventory_item'][2]//div[@class='inventory_item_name']")
    private WebElement secondItemName;

    @FindBy(xpath = "//div[@class='inventory_item'][2]//div[@class='inventory_item_desc']")
    private WebElement secondItemDescription;

    @FindBy(xpath = "//div[@class='inventory_item'][2]//div[@class='inventory_item_price']")
    private WebElement secondItemPrice;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement secondItemAddToCartButton;

    // Third inventory item
    @FindBy(xpath = "//div[@class='inventory_item'][3]//a[@id='item_1_title_link']")
    private WebElement thirdItemTitleLink;

    @FindBy(xpath = "//div[@class='inventory_item'][3]//div[@class='inventory_item_name']")
    private WebElement thirdItemName;

    @FindBy(xpath = "//div[@class='inventory_item'][3]//div[@class='inventory_item_desc']")
    private WebElement thirdItemDescription;

    @FindBy(xpath = "//div[@class='inventory_item'][3]//div[@class='inventory_item_price']")
    private WebElement thirdItemPrice;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement thirdItemAddToCartButton;

    // Fourth inventory item
    @FindBy(xpath = "//div[@class='inventory_item'][4]//a[@id='item_5_title_link']")
    private WebElement fourthItemTitleLink;

    @FindBy(xpath = "//div[@class='inventory_item'][4]//div[@class='inventory_item_name']")
    private WebElement fourthItemName;

    @FindBy(xpath = "//div[@class='inventory_item'][4]//div[@class='inventory_item_desc']")
    private WebElement fourthItemDescription;

    @FindBy(xpath = "//div[@class='inventory_item'][4]//div[@class='inventory_item_price']")
    private WebElement fourthItemPrice;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement fourthItemAddToCartButton;

    // Fifth inventory item
    @FindBy(xpath = "//div[@class='inventory_item'][5]//a[@id='item_2_title_link']")
    private WebElement fifthItemTitleLink;

    @FindBy(xpath = "//div[@class='inventory_item'][5]//div[@class='inventory_item_name']")
    private WebElement fifthItemName;

    @FindBy(xpath = "//div[@class='inventory_item'][5]//div[@class='inventory_item_desc']")
    private WebElement fifthItemDescription;

    @FindBy(xpath = "//div[@class='inventory_item'][5]//div[@class='inventory_item_price']")
    private WebElement fifthItemPrice;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement fifthItemAddToCartButton;

    // Sixth inventory item
    @FindBy(xpath = "//div[@class='inventory_item'][6]//a[@id='item_3_title_link']")
    private WebElement sixthItemTitleLink;

    @FindBy(xpath = "//div[@class='inventory_item'][6]//div[@class='inventory_item_name']")
    private WebElement sixthItemName;

    @FindBy(xpath = "//div[@class='inventory_item'][6]//div[@class='inventory_item_desc']")
    private WebElement sixthItemDescription;

    @FindBy(xpath = "//div[@class='inventory_item'][6]//div[@class='inventory_item_price']")
    private WebElement sixthItemPrice;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement sixthItemAddToCartButton;
}

