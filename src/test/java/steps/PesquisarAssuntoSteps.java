package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.HomePage;
import runner.RunCucumberTeste;

public class PesquisarAssuntoSteps extends RunCucumberTeste {

    HomePage homePage = new HomePage();

    @Dado("^que estou na tela home do Blog AGI$")
    public void que_estou_na_tela_home_do_Blog_AGI() throws Throwable {
        homePage.acessarSite();
    }

    @Dado("^preencho o campo pesquisar$")
    public void preencho_o_campo_pesquisar() throws Throwable {
        homePage.clicarBotaoLupa();
        homePage.preencheCampoPesquisa("teste");
    }

    @Quando("^clico em Pesquisar$")
    public void clico_em_Pesquisar() throws Throwable {
       homePage.clicarBotaoPesquisar();
    }

    @Então("^vejo uma lista com as pesquisas feitas com sucesso$")
    public void vejo_uma_lista_com_as_pesquisas_feitas_com_sucesso() throws Throwable {
        String mensagemTela = homePage.validarMensagemNaTela();
        //System.out.println(mensagemTela);
        Assert.assertEquals("Resultados da busca por: teste", mensagemTela );
    }

    @Dado("^nao preencho o campo pesquisar$")
    public void nao_preencho_o_campo_pesquisar() throws Throwable {
        homePage.clicarBotaoLupa();
        homePage.preencheCampoPesquisa("");
    }

    @Então("^vejo uma lista com as pesquisas default feitas com sucesso$")
    public void vejo_uma_lista_com_as_pesquisas_default_feitas_com_sucesso() throws Throwable {
        String mensagemTela = homePage.validarMensagemNaTela();
        //System.out.println(mensagemTela);
        Assert.assertEquals("Resultados da busca por:", mensagemTela );
    }

}
