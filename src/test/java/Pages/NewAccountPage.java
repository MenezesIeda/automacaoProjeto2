package Pages;

import Core.Driver;
import Maps.NewAccountMap;
import io.cucumber.messages.internal.com.google.protobuf.StringValue;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
    NewAccountMap newAccountMap;
    public NewAccountPage(){
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(),newAccountMap);
    }
    public String gettextCreateAccount(){
        Driver.visibilityOf(newAccountMap.textCreateAccount);
        return newAccountMap.textCreateAccount.getText();

    }
    public void setinpusername(String username){
        newAccountMap.inpUsername.sendKeys(username);
        Driver.visibilityOf(newAccountMap.inpUsername);
    }
    public void setinpEmail(String email){
        newAccountMap.inpEmail.sendKeys(email);
    }

    public void setinpPassword(String password){
        newAccountMap.inpPassword.sendKeys(password);

    }
    public void setinpConfirmaPassword(String password){
        newAccountMap.inpConfirmaPassword.sendKeys(password);
    }
    public void selectslCountry(String country){
        Select select = new Select(newAccountMap.slCountry);
        select.selectByVisibleText(country);
    }

    public void inpIagree(){
        newAccountMap.inpIagree.click();
    }
    public void clickbtnRegister(){
        newAccountMap.btnRegister.click();

    }
}
