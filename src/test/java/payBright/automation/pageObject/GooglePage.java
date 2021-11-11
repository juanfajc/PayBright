package payBright.automation.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;

public class GooglePage extends PageObject {

    @FindBy(css = "img.lnXdpd")
    private WebElementFacade googleImage;

    @FindBy(css = "input.gLFyf.gsfi")
    private WebElementFacade searchBar;

    @FindBy(css = "input.gNO89b")
    private WebElementFacade searchButton;

    @FindBy(xpath = "//*[contains(text(), \"https://paybright.com\")]")
    private WebElementFacade payBrightLink;

    @Step("The user searches PayBright")
    public void searchingPayBrightPage(String page){
        googleImage.shouldBeCurrentlyVisible();
        searchBar.type(page);
        searchButton.click();
    }

    @Step("The user selects PayBright page")
    public void selectPayBrightPage(String page){
        String title = payBrightLink.getText();
        Assert.assertTrue(title.contains(page.toLowerCase()));
        payBrightLink.click();
    }


}
