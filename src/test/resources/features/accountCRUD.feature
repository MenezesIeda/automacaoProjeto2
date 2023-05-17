#language:pt
@CRUD
  Funcionalidade: Account CRUD

    @cadastroCRUD
    Cenario: Cadastro nova conta
      Dado que a pagina New Account esteja sendo exibida
      Quando os campos de cadastro estiverem preenchidos
      |username|marcosval|
      |email   |ieda_menezes@hotmail.com|
      |password|Ieda321                 |
      |country |Brazil                  |
      Entao deve ser possivel logar no sistema apos o cadastro

      @loginCRUD
      Cenario: Login CRUD
        Dado que a modal esteja aberta
         Quando os campos de login sejam preenchidos da seguinte forma
        | usuario  | marcosval |
        | senha    | Ieda321   |
        | remember | <false>   |
      Quando for realizado o clique no botao sign in
      Entao deve ser possivel logar no sistema

        @alteracaoCRUD
        Cenario: Alteracao CRUD
          Dado que esteja logado no sistema
            | usuario  | marcosval |
            | senha    | Ieda321   |
            | remember | <false>   |

          Dado que esteja na pagina de alteracao da conta
          Quando altero os valores dos seguintes campos
          |firstname|valdemir|
          |lastname |rossato|
          Quando for realizado o clique em salvar
          Então a alteracao foi exibida na pagina MyAccount

          @exclusaoCRUD
          Cenario: Exclusao CRUD
            Dado que esteja logado no sistema
              | usuario  | marcosval |
              | senha    | Ieda321  |
              | remember | <false>   |
            Dado que esteja na pagina MyAccount
            Quando for efetuado o clique no Delete e Yes
            Entao o ususario deve ser deletado
