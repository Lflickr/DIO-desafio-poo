package produtos.iPhone;

import produtos.AparelhoTelefonico.AparelhoTelefonico;
import produtos.NavegadorInternet.NavegadorInternet;
import produtos.ReprodutorMusical.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    String cor;
    String modelo;
    int anoLancamento;

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica pelo iPhone");
    }
    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada pelo iPhone");
    }
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica: " +musica+" Selecionada pelo iPhone");
    }
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina web: " +url+ " via iPhone");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do iPhone");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina web no navegador do iPhone");
    }
    @Override
    public void ligar() {
        System.out.println("Fazendo chamada pelo iPhone");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo chamada pelo iPhone");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Abrindo correio de voz do iPhone");
    }
}
