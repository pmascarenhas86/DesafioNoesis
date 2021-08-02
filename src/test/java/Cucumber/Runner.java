package Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty","html:target/cucumber.html","json:target/cucumber.json"},
        features = "src/test/resources/features",
        tags = "@Teste2",
        glue={"stepDefinition"},
        monochrome = true
)

public class Runner {

}