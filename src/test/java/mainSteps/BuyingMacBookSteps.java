package mainSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import sharedUtils.SharedUtils;



public class BuyingMacBookSteps {

    private SharedUtils sharedUtils;
    private LandingPage landingPage;

    //dependency injection using pico-container via constructor injection
    public BuyingMacBookSteps(SharedUtils sharedUtils) {
        this.sharedUtils = sharedUtils;
    }

    @When("user searches laptop {string}")
    public void user_searches(String macBook) {
        landingPage = sharedUtils.getPageGenerator().getLandingPage();
        landingPage.searchMacBook(macBook);
    }

    @Then("user chooses macbook and selects the gold color MacBook")
    public void user_clicks_option_and_select_the_gold_color_mac_book() throws InterruptedException {
        landingPage.chooseMacBook();
    }

    @Then("user user adds item to cart and proceeds to checkout")
    public void user_user_adds_item_to_cart_and_proceeds_to_checkout() throws InterruptedException {
        landingPage.goToAddToCartPage();
    }



}
