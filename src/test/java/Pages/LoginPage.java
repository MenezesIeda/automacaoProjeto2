package Pages;

import Core.Driver;
import Maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;
    public LoginPage(){
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(),loginMap);
    }
    public void clickbtnLogin(){
       Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }
    public void clickbtnFechar(){
        Driver.visibilityOf(loginMap.btnFechar);
        loginMap.btnFechar.click();
    }
    public void clickdivFechaModal(){
        loginMap.divFechaModal.click();
    }
    public void setinpUsername(String username){
        if(username!=null){
            loginMap.inpUsername.sendKeys(username);
        }

    }
    public void setinpPassword(String password) {
        if (password != null) {
            loginMap.inpPassword.sendKeys(password);

        }
    }
    public void clickinpRemember(){
        loginMap.inpRemember.click();
    }
    public void clickbtnSigIn(){
        loginMap.btnSigIn.click();
    }
    public void clicklinkCreateNewAccount(){
        loginMap.linkCreateAccount.click();
    }
    public boolean isbtnSigIn(){
        return loginMap.btnSigIn.isEnabled();
    }
    public void visibilityOfBtnFechar(){
        Driver.visibilityOf(loginMap.btnFechar);
    }
    public void invisibilityOfBtnFechar(){
        Driver.invisibilityOf(loginMap.btnFechar);
    }
    public void aguardarLoader(){
        Driver.attributeChange(loginMap.divLoader,"display","none");
    }
    public String textLogado(){
        Driver.visibilityOf(loginMap.textLogado);
        return loginMap.textLogado.getText();
    }
    public String gettextErroLogin(){
        Driver.visibilityOf(loginMap.textErroLogin);
        return loginMap.textErroLogin.getText();
    }
}

