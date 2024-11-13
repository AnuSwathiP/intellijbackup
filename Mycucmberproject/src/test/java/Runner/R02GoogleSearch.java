package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java/F02GoogleSearch.feature"},
        glue = {"StepDef"})
public class R02GoogleSearch {
}
