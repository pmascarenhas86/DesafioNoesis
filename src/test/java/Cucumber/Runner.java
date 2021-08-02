package Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty","html:target/cucumber.html","json:target/cucumber.json"},
        features = "src/test/resources/features",
        tags = "@TestesUnimed",
        glue={"stepDefinition"},
        monochrome = true,
        dryRun = false
)

public class Runner {

}