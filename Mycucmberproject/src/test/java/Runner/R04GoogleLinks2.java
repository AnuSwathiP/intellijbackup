package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java/F04GoogleLinks2.feature"},
        glue = {"StepDef"},
        tags = "@GoogleLinks")
public class R04GoogleLinks2 {
    /*
     * Execute single Scenario  	tags = "@ImagesLink"
     * Execute Multiple Scenarios	tags = "@ImagesLink or @AdvtLink"
     * Skip single Scenario 		tags = "not @AdvtLink"
     * Execute all scenarios		tags = "@GoogleLinks"
     */
}
