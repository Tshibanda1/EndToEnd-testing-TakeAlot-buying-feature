package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DrumPurchasePage {

    private WebDriver webDriver; //the web-driver used on the drumPurchase Page
    int delay = 1000; //set the delay used in testing
    private By addToCartButton = By.xpath("//a[@class='button expanded add-to-cart-button-module_add-to-cart-button_1a9gT']");

    private By proceedToCheckOutButton = By.xpath("//a[@class='button pay checkout-button cart-summary-module_proceed-to-checkout-btn_3tQOD checkout-button-module_checkout-button_3B_QV']");

    private By goToCartButton = By.xpath("//button[@class = 'button checkout-now dark']");

    public DrumPurchasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickAddToCart() throws InterruptedException {
        Thread.sleep(delay);
        webDriver.findElement(addToCartButton).click();
    }

    public void goToCart() throws InterruptedException {
        Thread.sleep(delay);
        webDriver.findElement(goToCartButton).click();
    }

    public void proceedToCheckOut() throws InterruptedException {
        Thread.sleep(delay);
        webDriver.findElement(proceedToCheckOutButton).click();
    }
}
