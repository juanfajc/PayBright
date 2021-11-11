package payBright.automation.stepDefinition;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import payBright.automation.basePage.NavigateToBaseLink;
import payBright.automation.pageObject.GooglePage;
import payBright.automation.pageObject.PayBrightPage;

public class StepsForSearchingValue {

    @Steps(shared = true)
    private GooglePage googlePage;

    @Steps(shared = true)
    private NavigateToBaseLink navigateToBaseLink;

    @Steps(shared = true)
    private PayBrightPage payBrightPage;

    @Given("^A user wants to navigate to google$")
    public void openGoogleCanada(){
        navigateToBaseLink.openDefaultLink();
    }

    @When("^The user enters the name of the (.*) page in the search bar$")
    public void searchCriteriaInSearchBar(String page) {
        googlePage.searchingPayBrightPage(page);
    }

    @And("^The user selects the (.*) page$")
    public void selectAndClickInTheSearchResult(String page){
        googlePage.selectPayBrightPage(page);
    }

    @Then("^The user validates the (.*) page is loaded$")
    public void validateThePageIsLoaded(String page) {
        payBrightPage.validatePayBrightPage(page);
    }

    @And("^The user makes a searching for (.*) (.*) product in the Shop Directory$")
    public void searchProductInTheShopDirectory(String type, String product) {
        payBrightPage.searchProduct(type, product);
    }

    @Then("^The user validates the (.*) product is loaded in the page$")
    public void validateTheProductIsSelected(String product) {
        payBrightPage.validateFinalResult(product);
    }

}
