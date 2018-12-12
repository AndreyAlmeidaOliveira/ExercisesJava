package br.com.caelum.contas.testeErros;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		cc.deposita(100);
		cp.deposita(100);
		//		System.out.println("Valor Conta Corrente $"+cc.getSaldo());

		
		cc.setAgencia(123);
		cp.setAgencia(123);
		
		System.out.println(cp.equals(cc));
		
		try {
			cc.saca(102);
			System.out.println("Saque efetuado com sucesso");
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Valor Conta Corrente $"+cc.getSaldo());
				
	}

}
