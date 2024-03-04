package sharedUtils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;

public class SharedUtils {
    private PageGenerator pageGenerator;
    private String searchString;
    private DriverSetUp driverSetUp;
    private WebDriver webDriver;

    public SharedUtils(){
        driverSetUp = new DriverSetUp();
        webDriver = driverSetUp.getWebDriver();
        pageGenerator = new PageGenerator(webDriver);
    }

    public PageGenerator getPageGenerator() {
        return pageGenerator;
    }

    public String getSearchString() {
        return searchString;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

}
