package sauce_demo_po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

    WebDriver driver;

    public HeaderPage(WebDriver driver) {
    }

    public void HeaderPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Header container
    @FindBy(id = "header_container")
    WebElement headerContainer;

    // Primary header
    @FindBy(css = "div.primary_header")
    WebElement primaryHeader;

    // Menu button
    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;

    // Open Menu Icon
    @FindBy(css = "img[data-test='open-menu']")
    WebElement openMenuIcon;

    // Close Menu Button
    @FindBy(id = "react-burger-cross-btn")
    WebElement closeMenuButton;

    // Inventory Sidebar Link
    @FindBy(id = "inventory_sidebar_link")
    WebElement inventorySidebarLink;

    // About Sidebar Link
    @FindBy(id = "about_sidebar_link")
    WebElement aboutSidebarLink;

    // Logout Sidebar Link
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutSidebarLink;

    // Reset Sidebar Link
    @FindBy(id = "reset_sidebar_link")
    WebElement resetSidebarLink;

    // Shopping Cart Container
    @FindBy(id = "shopping_cart_container")
    WebElement shoppingCartContainer;

    // Shopping Cart Link
    @FindBy(css = "a.shopping_cart_link[data-test='shopping-cart-link']")
    WebElement shoppingCartLink;

    // Secondary Header Container
    @FindBy(css = "div.header_secondary_container[data-test='secondary-header']")
    WebElement secondaryHeaderContainer;

    // Page Title
    @FindBy(css = "span.title[data-test='title']")
    WebElement pageTitle;

    // Active Option in the Sort Dropdown
    @FindBy(css = "span.active_option[data-test='active-option']")
    WebElement activeSortOption;

    // Product Sort Dropdown
    @FindBy(css = "select.product_sort_container[data-test='product-sort-container']")
    WebElement productSortDropdown;


    public WebElement getTitle() {
        return pageTitle;
    }
}

