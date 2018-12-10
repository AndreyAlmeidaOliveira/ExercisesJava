package br.com.caelum.contas.modelo;

import br.com.caelum.contas.testeErros.SaldoInsufienteException;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo() {
		return " Corrente";
	}

	@Override
	public void saca(double valor) throws SaldoInsufienteException {
		if (this.saldo < valor) {
			throw new SaldoInsufienteException("saldo insuficiente");
		} else {
			this.saldo -= (valor + 0.10);
		}
	}

	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
	// @Override
	// public String getTipo() {
	// return null;
	// }
}
