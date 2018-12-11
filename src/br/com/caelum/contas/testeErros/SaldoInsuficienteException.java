package br.com.caelum.contas.testeErros;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(double valor) {
		super("Saldo insufiente para sacar o valor de: "+valor);
	}

	public SaldoInsuficienteException(String message) {
		super(message);
	}

}
