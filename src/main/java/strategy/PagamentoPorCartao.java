package strategy;

public class PagamentoPorCartao implements TipoPagamento{
	public String realizarPagamento(float valor) {		
		return "O valor será cobrado na próxima fatura do seu cartão de crédito no valor de " + String.valueOf(valor) + ".";
	}
}	
