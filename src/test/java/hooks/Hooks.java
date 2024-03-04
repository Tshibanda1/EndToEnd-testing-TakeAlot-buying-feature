package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import sharedUtils.SharedUtils;

public class Hooks {

    SharedUtils sharedUtils;

    public Hooks(SharedUtils sharedUtils){
        this.sharedUtils =sharedUtils;
    }


    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2500);
        sharedUtils.getWebDriver().quit();
    }

}
