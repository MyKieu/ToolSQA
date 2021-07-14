package UI;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class Ui extends PageObject {
    @FindBy(xpath = "//input[@id='userName']")
    public WebElementFacade txtUserName;
    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElementFacade txtEmail;
    @FindBy(css = "textarea#currentAddress.form-control")
    public WebElementFacade txtCurrentAddress;
    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    public WebElementFacade txtPermanentAddress;
    @FindBy(id = "submit")
    public WebElementFacade submit;
    @FindBy(xpath = "//input[@id='userName']")
    public WebElementFacade userLogin;
    @FindBy(xpath = "//input[@id='password']")
    public WebElementFacade passWord;
    @FindBy(xpath = "//button[@id='login']")
    public WebElementFacade btnLogin;
    @FindBy(xpath = "//label[@id='userName-value']")
    public WebElementFacade value;
    @FindBy(xpath = "//p[@id='name']")
    public WebElementFacade text;
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElementFacade firstname;
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElementFacade lastname;
    @FindBy(xpath = "//input[@id='userName']")
    public WebElementFacade name;
    @FindBy(xpath = "//input[@id='password']")
    public WebElementFacade pass;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]")
    public WebElementFacade recaptcha;
    @FindBy(id="register")
    public WebElementFacade register;
    @FindBy(xpath = "//button[@id='newUser']")
    public WebElementFacade newuser;
    @FindBy(xpath = "//p[@id='name']")
    public WebElementFacade errorPassWord;
    @FindBy(xpath = "//input[@id='searchBox']")
    public WebElementFacade search;
    @FindBy(id="basic-addon2")
    public WebElementFacade searchbtn;
    @FindBy(xpath = "//label[contains(text(),'Yes')]")
    public WebElementFacade rdoYes;
    @FindBy(xpath = "//label[contains(text(),'Impressive')]")
    public WebElementFacade rdoImpress;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/p[1]")
    public  WebElementFacade SelectedRadio;
    @FindBy(xpath = "//button[contains(text(),'Log out')]")
    public WebElementFacade btnLogOut;
    @FindBy(xpath = " //a[contains(text(),'Git Pocket Guide')]")
    public WebElementFacade linkBook;
    @FindBy(xpath = " //label[contains(text(),'9781449325862')]")
    public WebElementFacade ISBN;


}
