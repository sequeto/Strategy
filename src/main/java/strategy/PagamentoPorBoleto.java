package strategy;

public class PagamentoPorBoleto implements TipoPagamento{
	public String realizarPagamento(float valor) {		
		return "O pagamento no valor de " + String.valueOf(valor) + " pode ser realizado com o código de barras 6548964631668.";
	}
}
