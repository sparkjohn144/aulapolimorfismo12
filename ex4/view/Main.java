package ex4.view;

import ex4.model.Pagamento;
import ex4.model.PagamentoBancario;
import ex4.model.PagamentoCartao;

public class Main {
    public static void main(String[] args) {
        Pagamento pag1 = new Pagamento();
        PagamentoCartao pag2 = new PagamentoCartao();
        PagamentoBancario pag3 = new PagamentoBancario();
    
        System.out.println(pag1.processarPagamento());
        System.out.println(pag2.processarPagamento());
        System.out.println(pag3.processarPagamento());    
    }
}
