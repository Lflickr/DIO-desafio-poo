import Pessoa.Pessoa;
import produtos.NavegadorInternet.InternetExplorer;
import produtos.ReprodutorMusical.iPod;
import produtos.iPhone.iPhone;

public class App {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("Joao", 20);

        //abrindo Internet Explorer e comprando o iPod e o iPhone
        iPhone celular = joao.comprariPhone();
        iPod pod = joao.comprarIPod();
        InternetExplorer exp = joao.abrirInternetExplorer();

        //utilizando metodos de reprodutor de musica pelo iPhone
        celular.selecionarMusica("Bad");
        celular.tocarMusica();
        celular.pausarMusica();

        //utilizando metodos de navegador de internet pelo iPhone
        celular.adicionarNovaAba();
        celular.exibirPagina("google.com");
        celular.atualizarPagina();

        //utilizando metodos de aparelho telefonico pelo iPhone
        celular.ligar();
        celular.atender();
        celular.iniciarCorreioVoz();

        //utilizando metodos de reprodutor musical pelo iPod
        pod.selecionarMusica("Bad");
        pod.tocarMusica();
        pod.pausarMusica();

        //utilizando metodos de navegador de internet pelo Internet Explorer
        exp.adicionarNovaAba();
        exp.exibirPagina("google.com");
        exp.atualizarPagina();
    }
}
