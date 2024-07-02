package produtos.ReprodutorMusical;

public class iPod implements ReprodutorMusical {

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
        System.out.println("Tocando musica via iPod");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica via iPod");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " +musica+ " via iPod");
    }

}
