package Object;

import Pages.TextBoxPage;

public class TextBoxPageObject {
    private String txtUserName;
    private String txtEmail;
    private String txtCurrentAddress;
    private String txtPermanentAddress;
TextBoxPage textBoxPage;
    public String getUserName() {

        return txtUserName;
    }

    public String getEmail() {

        return txtEmail;
    }
    public String getCurrentAddress() {

        return txtCurrentAddress;
    }
    public String getPermanentAddress() {
        return txtPermanentAddress;
    }

}
