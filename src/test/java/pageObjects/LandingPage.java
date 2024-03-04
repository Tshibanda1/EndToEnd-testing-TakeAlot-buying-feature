package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import sharedUtils.SharedUtils;

public class LandingPage {

    int delay = 1000; //set the delay used in testing
    private By proceedToCheckOutButton = By.xpath("//a[@class='button pay checkout-button cart-summary-module_proceed-to-checkout-btn_3tQOD checkout-button-module_checkout-button_3B_QV']");

    private By searchBar = By.xpath("//input[@name = 'search']");
    private By goToCartMacBook = By.xpath("//button[@class='button checkout-now dark']");
    private By addToCartButton = By.xpath("//a[@class='button expanded add-to-cart-button-module_add-to-cart-button_1a9gT']");

    private By acceptCookiesButton = By.xpath("//button[@class='button cookies-banner-module_dismiss-button_24Z98']");
    private By selectPearlDrum = By.xpath("//a[@title = 'Pearl Roadshow Jazz Drum Set - Black']");
    private By goldMacBookImageSelect = By.xpath("//img[@alt ='Gold']");
    private By selectOptionMacBookColorButton = By.xpath("//button[@class='button ghost dark basic variants-cta buybox-actions-module_call-to-action_3DrOo']");
    private By showAllOptionsMacBookButton = By.xpath("//a[@class='button shop-all-options dark-green ghost']");
    private WebDriver webDriver;

    public LandingPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void searchDrumSet(String drumSet) {
        webDriver.findElement(acceptCookiesButton).click();
        webDriver.findElement(searchBar).sendKeys(drumSet);
        webDriver.findElement(searchBar).sendKeys(Keys.ENTER);
    }

    public void chooseDrumSet() throws InterruptedException {
        Thread.sleep(delay);
        webDriver.findElement(selectPearlDrum).click();
    }

    public void searchMacBook(String laptop) {
        webDriver.findElement(acceptCookiesButton).click();
        webDriver.findElement(searchBar).sendKeys(laptop);
        webDriver.findElement(searchBar).sendKeys(Keys.ENTER);
    }

    public void chooseMacBook() throws InterruptedException {
        Thread.sleep(delay);
        webDriver.findElement(showAllOptionsMacBookButton).click();
        Thread.sleep(delay);
        webDriver.findElement(selectOptionMacBookColorButton).click();
        Thread.sleep(delay);
        webDriver.findElement(goldMacBookImageSelect).click();

    }

    public void goToAddToCartPage() throws InterruptedException {
        Thread.sleep(delay);
        webDriver.findElement(addToCartButton).click();
        Thread.sleep(delay);
        webDriver.findElement(goToCartMacBook).click();
        Thread.sleep(delay);
        webDriver.findElement(proceedToCheckOutButton).click();
        Thread.sleep(delay);
    }
}
