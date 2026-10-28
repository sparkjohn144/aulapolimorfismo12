package ex4.model;

public class PagamentoBancario extends Pagamento{
    @Override
    public String processarPagamento() {
        return "Processando pagamento via boleto bancário";
    }
}
