package fj11.cap5;

import java.util.TimeZone;

public class TestAccount {

	public static void main(String[] args) {
		Account conta = new Account();
		Account conta2 = new Account();
		Account conta3 = new Account();
		
		System.out.println("Total de Contas: "+Account.getTotalContas());
		Account.setTotalContas(Account.getTotalContas()+100);
		System.out.println(Account.getTotalContas());
//		System.out.println(conta.titular);
	}

}
