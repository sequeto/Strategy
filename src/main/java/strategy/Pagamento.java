package strategy;

public class Pagamento {
	private float valor;

    public Pagamento(float valor) {
        this.valor = valor;
    }

    public String realizarPagamento(TipoPagamento tipoPagamento) {
        return tipoPagamento.realizarPagamento(valor);
    }
	
}
