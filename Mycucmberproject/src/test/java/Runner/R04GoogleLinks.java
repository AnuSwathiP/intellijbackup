package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//CUCUMBER_PUBLISH_TOKEN=1c911518-c8d6-4719-8545-6986c5587864
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java/F04GoogleLinks.feature"},
        glue = {"StepDef"})
public class R04GoogleLinks {
}
