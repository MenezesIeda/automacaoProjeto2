package Pages;

import Core.Driver;
import Maps.MyAccountMap;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    MyAccountMap myAccountMap;

    public MyAccountPage() {
        myAccountMap = new MyAccountMap();
        PageFactory.initElements(Driver.getDriver(), myAccountMap);
    }

    public void clickLinkUser() {
        myAccountMap.linkUser.click();
    }

    public void cliklinkMyAccount() {
        Driver.visibilityOf(myAccountMap.linkMyAccount);
        myAccountMap.linkMyAccount.click();
    }

    public void clicklinkEdit() {
        Driver.visibilityOf(myAccountMap.linkEdit);
        myAccountMap.linkEdit.click();
    }

    public String gettextUsuario() {
        Driver.visibilityOf(myAccountMap.textUsuario);
        return myAccountMap.textUsuario.getText();
    }

    public void clickbtnDelete() {
        Driver.visibilityOf(myAccountMap.btnDelete);
        myAccountMap.btnDelete.click();
    }

    public void clickbtnYes() {
        Driver.visibilityOf(myAccountMap.btnYes);
        myAccountMap.btnYes.click();
    }

    public String getTextDelete() {
        Driver.visibilityOf(myAccountMap.textDelete);
        return myAccountMap.textDelete.getText();
    }
}