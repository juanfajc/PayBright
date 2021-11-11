package payBright.automation.basePage;

import cucumber.api.java.en.Given;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class NavigateToBaseLink extends PageObject {

    BaseLinkPage baseLinkPage;

    @Step("Open the default link")
    public void openDefaultLink(){
        baseLinkPage.open();
    }
}
