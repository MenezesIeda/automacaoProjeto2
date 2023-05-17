package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "",
        glue = "Steps",
        plugin = {"json:target/reports/CucumberReports.json","pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {
}
