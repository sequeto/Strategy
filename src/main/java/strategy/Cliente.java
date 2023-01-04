package strategy;

public class Cliente {
	private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void realizarPagamentoPorCartao(float valor) {
        Pagamento pagamento = new Pagamento(valor);
        this.resultado = pagamento.realizarPagamento(new PagamentoPorCartao());
    }

    public void realizarPagamentoViaBoleto(float valor) {
        Pagamento pagamento = new Pagamento(valor);
        this.resultado = pagamento.realizarPagamento(new PagamentoPorBoleto());
    }
    
    public void realizarPagamentoViaPayPal(float valor) {
        Pagamento pagamento = new Pagamento(valor);
        this.resultado = pagamento.realizarPagamento(new PagamentoViaPaypal());
    }
}
