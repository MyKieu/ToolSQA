package Pages;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import UI.Ui;


@DefaultUrl("https://demoqa.com/text-box")
public class TextBoxPage extends PageObject {
    Ui ui;
    public String getUserName() {

        return ui.txtUserName.getTextValue();
    }

    public String getEmail() {

        return ui.txtEmail.getTextValue();
    }
    public String getCurrentAddress() {

        return ui.txtCurrentAddress.getValue();
    }
    public String getPermanentAddress() {

        return ui.txtPermanentAddress.getValue();
    }

    public String colorCode(){
        String colorCode= ui.txtEmail.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String expectedColorWhenTrue(){
        String expectedColorCodeInRGB= "rgba(255, 0, 0, 1)";
        return expectedColorCodeInRGB;
    }
    public void openHomePage() {
        open();
    }
    public void  clickSubmit() {
        evaluateJavascript("document.querySelector('#submit').click()");
    }
}
