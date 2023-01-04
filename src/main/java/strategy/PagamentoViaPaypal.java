package strategy;

public class PagamentoViaPaypal implements TipoPagamento{
	public String realizarPagamento(float valor) {
		return "O pagamento no valor de " + String.valueOf(valor) + " utilizando PayPal realizado com sucesso.";
	}
}
