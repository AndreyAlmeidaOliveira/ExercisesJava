package br.com.caelum.contas.modelo;

import br.com.caelum.contas.testeErros.SaldoInsufienteException;

public abstract class Conta {
	private String nomeTitular;
	private int numeroConta;
	private int agencia;
	protected double saldo;
	// Data dataAbertura;
	private String getNumero;

	public Conta() {

	}

	public abstract String getTipo();

	// public String getTipo() {
	// return "Conta";
	// }

	public String getTitular() {
		return nomeTitular;
	}

	public void setTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumero() {
		return numeroConta;
	}

	public void setNumero(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void saca(double valor) throws SaldoInsufienteException {
		if (this.saldo < valor) {
			throw new SaldoInsufienteException("Saldo Insuficiente");
		} else {
			this.saldo -= valor;
		}
		// return true;
	}

	public void deposita(double valor) {

		// double novoSaldo = this.saldo + valor;
		// this.saldo = novoSaldo;
		if (valor < 0) {
			// throw new illegalArgumentException();
		} else {
			this.saldo += valor;
		}
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	// public void transfere(double valor, Conta conta) {
	// this.saca(valor);
	// conta.deposita(valor);
	// }

	public String recuperaDadosParaImpressao() {
		String dados = "Titular:	" + this.getTitular();
		dados += "\nN�mero:	" + this.getNumero;
		dados += "\nAg�ncia:	" + this.agencia;
		dados += "\nSaldo:	R$" + this.saldo;
		dados += "\nTipo:	" + this.getTipo();
		return dados;
	}
	// public void recuperarDadosParaImpressao() {
	// System.out.println("\nNome: \t\t\t" + getTitular() + "\nN�mero Conta: \t\t" +
	// "\nAg�ncia: \t\t" + agencia);
	// dados += "\nData de Abertura:
	// \t"+dataAbertura.dia+"/"+dataAbertura.mes+"/"+dataAbertura.ano;
	// dados += dataAbertura.apresentaData();
	// return dados;
}

// }
