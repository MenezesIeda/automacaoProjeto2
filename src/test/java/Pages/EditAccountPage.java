package Pages;

import Core.Driver;
import Maps.EditAccountMap;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage {
    EditAccountMap editAccountMap;
    public  EditAccountPage(){
        editAccountMap = new EditAccountMap();
        PageFactory.initElements(Driver.getDriver(),editAccountMap);
    }
    public void setinpFirstname(String firstname){
        Driver.visibilityOf(editAccountMap.inpFirstname);
        editAccountMap.inpFirstname.sendKeys(firstname);
    }
    public void setinpLastname(String lastname){
        Driver.visibilityOf(editAccountMap.inpLastname);
        editAccountMap.inpLastname.sendKeys(lastname);
    }
    public void clickbtnSave(){
        Driver.visibilityOf(editAccountMap.btnSave);
        editAccountMap.btnSave.click();
    }
}
