package payBright.general;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/payBright/automation/feature"},
        glue = {"payBright.automation"},
        tags = {"@SamsungTest"}
)
public class TestRunner{
}
