package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class A01youtubesearch {
    WebDriver driver;
    @Given("Open youtube")
    public void open_youtube() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.youtube.com/");
    }

    @When("Enter valid keyword in youtube Searchbox")
    public void enter_valid_keyword_in_youtube_searchbox() throws InterruptedException {
        Thread.sleep(1000);
        //xpath using selectors hub
        driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[4]/div[2]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Cucumber Framework");
//        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).sendKeys("Cucumber Framework");
    }
    @When("I hit enterbutton")
    public void i_hit_enterbutton() {
        driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[4]/div[2]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
//        driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).sendKeys(Keys.ENTER);
    }
    @Then("Search youtube result should display")
    public void search_youtube_result_should_display() throws InterruptedException {
        Thread.sleep(1000);
        if(driver.getTitle().contains("Cucumber"))
            System.out.println("Valid search result displayed");
        else
            System.out.println("Invalid search result displayed");

//        driver.close();
    }

}
