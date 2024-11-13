package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java/F07RediffRegistration.feature"},
        glue = {"StepDef"},
        plugin = {"json:Reports/Cucumber-json.json", "junit:Reports/xmlReport.xml"})//refresh to see Reports folder

public class R07RediffRegistraion {
}
