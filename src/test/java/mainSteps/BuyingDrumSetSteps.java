package mainSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.DrumPurchasePage;
import pageObjects.LandingPage;
import sharedUtils.SharedUtils;

import java.util.Iterator;
import java.util.Set;

public class BuyingDrumSetSteps {

    //dependency injection using pico-container via constructor injection
    public BuyingDrumSetSteps(SharedUtils sharedUtils) {
        this.sharedUtils = sharedUtils;
    }
    private LandingPage landingPage;
    private DrumPurchasePage drumPurchasePage;

    private SharedUtils sharedUtils;
    private WebDriver webDriver;

    @Given("User is on TakeALot landing page")
    public void user_is_on_takealot_landing_page() {

    }
    @When("user searches {string}")
    public void user_searches(String drumSet) {
        sharedUtils.setSearchString(drumSet);
        landingPage = sharedUtils.getPageGenerator().getLandingPage();
        landingPage.searchDrumSet(drumSet);
    }

    @Then("user chooses a drum set from given option")
    public void user_chooses_a_drum_set_from_given_option() throws InterruptedException {
        landingPage.chooseDrumSet();
        switchToShoppingCartPage();
    }

    @Then("adds chosen drumSet to cart")
    public void adds_chosen_drumSet_to_cart() throws InterruptedException {
        drumPurchasePage = sharedUtils.getPageGenerator().getDrumPurchasePage();
        drumPurchasePage.clickAddToCart();
        drumPurchasePage.goToCart();
        drumPurchasePage.proceedToCheckOut();
    }

    //code used to switch selenium to Shopping cart page
    void switchToShoppingCartPage() {
        webDriver = sharedUtils.getWebDriver();
        Set<String> pages = webDriver.getWindowHandles();
        Iterator<String> i1 = pages.iterator();
        String landingPageLink = i1.next();
        String addToCartPage = i1.next();
        webDriver.switchTo().window(addToCartPage);
    }

}
