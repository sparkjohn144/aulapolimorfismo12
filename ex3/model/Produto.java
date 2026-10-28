package ex3.model;

public class Produto {
    public String nome;
    public Double preco;
    public int estoque;
    
    public Produto(String nome){
        this.nome = nome;
    }
    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(String nome, Double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
}
