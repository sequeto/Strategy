package strategy;

import static org.junit.Assert.*;

import org.junit.Test;


public class ClienteTest {
	@Test
    public void deveRealizarPagamentoPorCartao() {
        Cliente cliente = new Cliente();
        cliente.realizarPagamentoPorCartao(80.0f);
        assertEquals("O valor será cobrado na próxima fatura do seu cartão de crédito no valor de 80.0.", cliente.getResultado());
	}
	
	@Test
    public void deveRealizarPagamentoViaPayPal() {
        Cliente cliente = new Cliente();
        cliente.realizarPagamentoViaPayPal(80.0f);
        assertEquals("O pagamento no valor de 80.0 utilizando PayPal realizado com sucesso.", cliente.getResultado());
	}
	
	@Test
    public void deveRealizarPagamentoPorBoleto() {
        Cliente cliente = new Cliente();
        cliente.realizarPagamentoViaBoleto(80.0f);
        assertEquals("O pagamento no valor de 80.0 pode ser realizado com o código de barras 6548964631668.", cliente.getResultado());
	}

}
