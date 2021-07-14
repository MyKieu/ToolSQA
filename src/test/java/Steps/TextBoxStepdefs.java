package Steps;

import Object.TextBoxPageObject;
import Pages.TextBoxPage;
import UI.Ui;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import java.util.List;

public class TextBoxStepdefs extends PageObject {
    @Steps
    TextBoxPage textBoxPage;
    Ui ui;
    @Given("^Open home page$")
    public void openHomePage() {
        textBoxPage.openHomePage();
    }
    @And("^Valid data to all textfield$")
    public void validDataToAllTextfield(List<TextBoxPageObject>  usercredentials) {
        for (TextBoxPageObject textbox : usercredentials) {
            ui.txtUserName.sendKeys(textbox.getUserName());
            ui.txtEmail.sendKeys(textbox.getEmail());
            ui.txtCurrentAddress.sendKeys(textbox.getCurrentAddress());
            ui.txtPermanentAddress.sendKeys(textbox.getPermanentAddress());

        }
    }
    @Then("^The website display data in textbox correct$")
    public void theWebsiteDisplayDataInTextboxCorrect(List<TextBoxPageObject>  usercredentials) {

        for (TextBoxPageObject textbox : usercredentials) {
            Assert.assertEquals(textBoxPage.getUserName(),textbox.getUserName());
            Assert.assertEquals(textBoxPage.getEmail(),textbox.getEmail());
            Assert.assertEquals(textBoxPage.getCurrentAddress(),textbox.getCurrentAddress());
            Assert.assertEquals(textBoxPage.getPermanentAddress(),textbox.getPermanentAddress());
        }
    }
    @And("^Click to submit$")
    public void clickToSubmit() {
        textBoxPage.clickSubmit();
    }

    @Then("^The website display input with color red$")
    public void theWebsiteDisplayInputWithColorRed() {
        Assert.assertEquals(textBoxPage.expectedColorWhenTrue(),textBoxPage.colorCode());
    }

}
