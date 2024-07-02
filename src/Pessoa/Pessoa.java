package Pessoa;

import produtos.NavegadorInternet.InternetExplorer;
import produtos.ReprodutorMusical.iPod;
import produtos.iPhone.iPhone;

public class Pessoa {
    String nome;
    int idade;

    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    
    //construtor do objeto Pessoa
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public iPhone comprariPhone(){
        iPhone cel = new iPhone();
        return cel;
    }

    public iPod comprarIPod(){
        iPod mus = new iPod();
        return mus;
    }

    public InternetExplorer abrirInternetExplorer(){
        InternetExplorer exp = new InternetExplorer();
        return exp;
    }
}
