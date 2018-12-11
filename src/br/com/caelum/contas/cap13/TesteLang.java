package br.com.caelum.contas.cap13;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

//import br.com.caelum.contas.modelo.Conta;

public class TesteLang extends Object {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		ContaCorrente cc1 = new ContaCorrente();
		
		cc.imprimeDados(cc);
		
		cc1.setTitular("Joãozinho 30");
		System.out.println(cc.toString());
		System.out.println("Conta: "+cc1);
		
		System.out.println(cc.equals(cc1));
		

	}
}
