package produtos.NavegadorInternet;

public class InternetExplorer implements NavegadorInternet {

    String versao;
    
    public String getVersao() {
        return versao;
    }
    public void setVersao(String versao) {
        this.versao = versao;
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina web: " +url+ " pelo Internet Explorer");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao Internet Explorer");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina web do Internet Explorer");
    }

}
