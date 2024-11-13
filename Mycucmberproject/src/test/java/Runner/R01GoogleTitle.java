package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java/F01GoogleTitle.feature"},
        glue = {"StepDef"}) //StepDef is name of package
public class R01GoogleTitle {
}
