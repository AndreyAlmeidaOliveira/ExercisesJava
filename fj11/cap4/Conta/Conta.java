package Conta;

public class Conta {
	String nomeTitular;
	int numeroConta;
	int agencia;
	double saldo;
	Data dataAbertura;
	
	public Conta() {
		
	}
	
	public boolean saca (double valor) {
		this.saldo -= valor;
		return true;
	}
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public double calculaRendimento () {
		return this.saldo*0.1;
	}
	
	public String recuperarDadosParaImpressao() {
		String dados = "\nNome: \t\t\t"+nomeTitular;
				dados += "\nNúmero Conta: \t\t"+numeroConta;
				dados += "\nAgência: \t\t"+agencia;
				dados += "\nData de Abertura: \t"+dataAbertura.dia+"/"+dataAbertura.mes+"/"+dataAbertura.ano;
				dados += dataAbertura.apresentaData();
				return dados;
	}
	

}
