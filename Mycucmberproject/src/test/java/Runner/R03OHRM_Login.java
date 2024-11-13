package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java/F03OHRM_Login.feature"},
        glue = {"StepDef"},
        publish = true)//publish = true is to generate report
public class R03OHRM_Login {
}
