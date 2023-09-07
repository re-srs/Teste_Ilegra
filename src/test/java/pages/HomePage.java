package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Utils;

public class HomePage extends Utils {



    private By botao_lupa = By.id("search-open");
    private By campo_pesquisar = By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/form/label/input");
    private By botaoPesquisar = By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/form/input");
    private By mensagemResultadosDaBusca = By.className("archive-title");

    public void acessarSite() {
        getDriver().get("https://blogdoagi.com.br/");
        getDriver().manage().window().maximize();
        //esperarElementoEstarPresente(botao_lupa, 20);
    }


    public void preencheCampoPesquisa(String message) {
        getDriver().findElement(campo_pesquisar).sendKeys(message);

    }


    public void clicarBotaoLupa() {
        getDriver().findElement(botao_lupa).click();
    }

    public void clicarBotaoPesquisar() {
        getDriver().findElement(botaoPesquisar).click();
    }

    public String validarMensagemNaTela() {
        String mensagemTela = getDriver().findElement(mensagemResultadosDaBusca).getText();
        return mensagemTela;
    }
}