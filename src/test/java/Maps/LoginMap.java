package Maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUser")
    public WebElement btnLogin;

    @FindBy(css = ".closeBtn")
    public WebElement btnFechar;

    @FindBy(css = ".PopUp")
    public WebElement divFechaModal;

    @FindBy(name = "username")
    public WebElement inpUsername;

    @FindBy(name = "password")
    public WebElement inpPassword;

    @FindBy(name = "remember_me")
    public WebElement inpRemember;

    @FindBy(css = "#sign_in_btnundefined")
    public WebElement btnSigIn;

    @FindBy(linkText = "CREATE NEW ACCOUNT")
    public WebElement linkCreateAccount;

    @FindBy(css = ".loader")
    public WebElement divLoader;

    @FindBy(css =".containMiniTitle ")
    public WebElement textLogado;

    @FindBy(xpath ="//label[contains(text(),'Incorrect')]")
  public WebElement textErroLogin;
}

