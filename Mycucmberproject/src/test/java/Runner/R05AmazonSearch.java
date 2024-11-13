package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java/F05AmazonSearch.feature"},
        glue = {"StepDef", "ForHooks"})
public class R05AmazonSearch {
}
