package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGenerator {

    private WebDriver webDriver;
    private LandingPage landingPage;
    private DrumPurchasePage drumPurchasePage;
    private PageGenerator pageGenerator;


    public PageGenerator(WebDriver webDriver) {
        this.webDriver = webDriver;

    }


    public LandingPage getLandingPage() {
        return landingPage = new LandingPage(webDriver);

    }

    public DrumPurchasePage getDrumPurchasePage() {
        return drumPurchasePage = new DrumPurchasePage(webDriver);
    }


}
