package ForHooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class AmazonHooks {
    @Before
    public void openBrowser() throws InterruptedException {
        System.out.println("Opening Browser");
        Thread.sleep(2000);
    }
    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Closing browser");
    }
}
