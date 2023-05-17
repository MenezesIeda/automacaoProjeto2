package Steps;

import Pages.EditAccountPage;
import Pages.MyAccountPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class EditAccountSteps {
    MyAccountPage myAccountPage;
    EditAccountPage editAccountPage;
    Map<String,String>mapDados;

    @Dado("que esteja na pagina de alteracao da conta")
    public void queEstejaNaPaginaDeAlteracaoDaConta() {
        myAccountPage = new MyAccountPage();
        myAccountPage.clickLinkUser();
        myAccountPage.cliklinkMyAccount();
        myAccountPage.clicklinkEdit();

    }
    @Quando("altero os valores dos seguintes campos")
    public void alteroOsValoresDosSeguintesCampos(Map<String,String> map) {
       mapDados = map;
        editAccountPage = new EditAccountPage();
        editAccountPage.setinpFirstname(map.get("firstname"));
        editAccountPage.setinpLastname(map.get("lastname"));
        editAccountPage.clickbtnSave();
    }
    @Quando("for realizado o clique em salvar")
    public void forRealizadoOCliqueEmSalvar() {
        editAccountPage.clickbtnSave();
    }
    @Então("a alteracao foi exibida na pagina MyAccount")
    public void aAlteracaoFoiExibidaNaPaginaMyAccount() {
       String nome = mapDados.get("firstname")+" "+mapDados.get("lastname");
        Assert.assertEquals(nome,myAccountPage.gettextUsuario());
    }
}
