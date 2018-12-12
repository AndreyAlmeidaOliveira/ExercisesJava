package br.com.caelum.contas.modelo;

import br.com.caelum.contas.testeErros.SaldoInsuficienteException;

public abstract class Conta {
	private String nomeTitular;
	private int numeroConta;
	private int agencia;
	protected double saldo;
	// Data dataAbertura;
	private String getNumero;
	private Conta outraConta;

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

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		} else {
			this.saldo -= valor;
		}
		// return true;
	}

	public void deposita(double valor) {

		// double novoSaldo = this.saldo + valor;
		// this.saldo = novoSaldo;
		if (valor < 0) {
			throw new IllegalArgumentException("Valor Negativo");

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
		dados += "\nNúmero:	" + this.getNumero;
		dados += "\nAgência:	" + this.agencia;
		dados += "\nSaldo:	R$" + this.saldo;
		dados += "\nTipo:	" + this.getTipo();
		return dados;
	}

	@Override
	public String toString() {
		return "[titular=" + nomeTitular + ", número=" + numeroConta + ", agencia=" + agencia + "]";
	}
	// public void recuperarDadosParaImpressao() {
	// System.out.println("\nNome: \t\t\t" + getTitular() + "\nNúmero Conta: \t\t" +
	// "\nAgência: \t\t" + agencia);
	// dados += "\nData de Abertura:
	// \t"+dataAbertura.dia+"/"+dataAbertura.mes+"/"+dataAbertura.ano;
	// dados += dataAbertura.apresentaData();
	// return dados;

	public void imprimeDados(Conta conta) {
		System.out.println(conta.getTitular() + " - " + conta.getSaldo());
	}

	public void println(Object obj) {
		write(obj.toString());
	}

	private void write(String string) {

	}

	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		if (!(object instanceof Conta)) {
			return false;
		}
		outraConta = (Conta) object;
//		return numeroConta == outraConta.getNumero() && agencia.equals(outraConta.getAgencia());
		// if (numeroConta == outraConta.numeroConta && equals(outraConta.agencia)) {
		// return true;
		// }
		 return true;
	}

}