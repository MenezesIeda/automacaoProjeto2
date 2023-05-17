package Maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountMap {
    @FindBy(name = "first_nameAccountDetails")
    public WebElement inpFirstname;

    @FindBy(name = "last_nameAccountDetails")
    public WebElement inpLastname;

    @FindBy(css = "#save_btnundefined")
    public WebElement btnSave;
}
