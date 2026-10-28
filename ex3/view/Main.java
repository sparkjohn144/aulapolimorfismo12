package ex3.view;
import java.text.DecimalFormat;

import ex3.model.Produto;

public class Main {
    public static void main(String[] args){
        Produto prod1 = new Produto("cavalo");
        Produto prod2 = new Produto("potro", 67.0);
        Produto prod3 = new Produto("Eguas", 67.0, 10);
        DecimalFormat df = new DecimalFormat("0.00");
        Produto[] produtos = new Produto[3];
        produtos[0] = prod1;
        produtos[1] = prod2;
        produtos[2] = prod3;

        //Para cada elemento do produtos, criar produto
        for (int i=0; i<produtos.length; i++) {
            if (produtos[i].estoque != 0) {
                System.out.println("Nome do produto "+ (i+1) + ": "+produtos[i].nome
                 + "\nPreço do produto "+ (i+1) + ": "+df.format(produtos[i].preco) 
                  + "\nEstoque do produto "+ (i+1) + ": "+produtos[i].estoque);
            }
            else if (produtos[i].preco != null) {
                System.out.println("Nome do produto "+ (i+1) + ": "+produtos[i].nome
                 + "\nPreço do produto "+ (i+1) + ": "+df.format(produtos[i].preco));
            }
            else{
                System.out.println("Nome do produto "+ (i+1) + ": "+produtos[i].nome);
            }
        }
    }
}