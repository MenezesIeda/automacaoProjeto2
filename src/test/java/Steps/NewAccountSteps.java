package Steps;

import Core.Driver;
import Pages.LoginPage;
import Pages.NewAccountPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class NewAccountSteps {
    String username;
    NewAccountPage newAccountPage;
    @Dado("que a pagina New Account esteja sendo exibida")
    public void que_a_pagina_new_account_esteja_sendo_exibida() {
        newAccountPage = new NewAccountPage();
        Driver.getDriver().get("https://advantageonlineshopping.com/#/");
        Driver.getDriver().get("https://advantageonlineshopping.com/#/register");
        Assert.assertEquals("CREATE ACCOUNT",newAccountPage.gettextCreateAccount());

    }
    @Quando("os campos de cadastro estiverem preenchidos")
    public void os_campos_de_cadastro_estiverem_preenchidos(Map<String, String> map) {
        username = map.get("username");
newAccountPage.setinpusername(map.get("username"));
newAccountPage.setinpEmail(map.get("email"));
newAccountPage.setinpPassword(map.get("password"));
newAccountPage.setinpConfirmaPassword(map.get("password"));
newAccountPage.selectslCountry(map.get("country"));
newAccountPage.inpIagree();
newAccountPage.clickbtnRegister();

    }
    @Entao("deve ser possivel logar no sistema apos o cadastro")
    public void deve_ser_possivel_logar_no_sistema_apos_o_cadastro() {
        LoginPage loginPage = new LoginPage();
        Assert.assertEquals(username,loginPage.textLogado());
    }
}
