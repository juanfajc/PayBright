package payBright.automation.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class PayBrightPage extends PageObject {

    @FindBy(css = "#mui-component-select-sort-by")
    private WebElementFacade dropDownFeature;

    @FindBy(xpath = "//li[@role='option']")
    private List<WebElementFacade> listValues;

    @FindBy(css = "[name='search']")
    private WebElementFacade searchEntryElement;

    @FindBy(xpath = "//p[@class='Deck-sc-1ddt9q-0 kOqrRh']")
    private WebElementFacade resultButton;

    @Step("The user validate the PayBright Page")
    public void validatePayBrightPage(String page){
        String title = getTitle();
        Assert.assertTrue(title.contains(page));
    }

    @Step("The user look for a product in the PayBright page")
    public void searchProduct(String type, String product) {
        dropDownFeature.waitUntilClickable().click();
        listValues.get(selectListValue(type)).waitUntilClickable().click();
        searchEntryElement.typeAndEnter(product);
    }

    @Step("The user validate the Product is sort in the page")
    public void validateFinalResult(String product) {
        String getResultValue = resultButton.waitUntilPresent().getText();
        Assert.assertTrue(getResultValue.contains(product));
    }

    private List<String> getDropDownValue(){
        return findAll("//li[@role='option']")
                .stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }

    private int selectListValue(String type) {
        return getDropDownValue().indexOf(type);
    }
}
