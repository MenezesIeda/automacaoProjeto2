package Steps;

import Pages.MyAccountPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class MyAccountSteps {
    MyAccountPage myAccountPage;
    @Dado("que esteja na pagina MyAccount")
    public void queEstejaNaPaginaMyAccount() {
        myAccountPage =new MyAccountPage();
        myAccountPage.clickLinkUser();
        myAccountPage.cliklinkMyAccount();

    }
    @Quando("for efetuado o clique no Delete e Yes")
    public void forEfetuadoOCliqueNoDeleteEYes() {
        myAccountPage.clickbtnDelete();
        myAccountPage.clickbtnYes();
    }
    @Entao("o ususario deve ser deletado")
    public void oUsusarioDeveSerDeletado() {
        Assert.assertEquals("Account deleted sucessfully",myAccountPage.getTextDelete());
    }
}
