package sharedUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverSetUp {
    private WebDriver webDriver;

    public DriverSetUp(){
        webDriver = new ChromeDriver();
        webDriver.get("https://www.takealot.com/");
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }



}
