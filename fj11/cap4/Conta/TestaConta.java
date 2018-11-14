package Conta;

public class TestaConta {

	public static void main(String[] args) {
		Conta account = new Conta();
		Data date = new Data();
		
		account.nomeTitular = "João das Couves";
		account.agencia= 001;
		account.dataAbertura=date;
		account.dataAbertura.ano=2018;
		account.dataAbertura.dia=23;
		account.dataAbertura.mes=10;
		account.numeroConta=1234;
		account.saldo=25000.;
		
		/*account.deposita(3000.);
		System.out.println("Saldo Atual: \t\tR$"+account.saldo);
		System.out.println("Rendimento mensal: \tR$"+account.calculaRendimento());
		*/
		
		System.out.println(account.recuperarDadosParaImpressao()); 

		//		System.out.println(date.apresentaData());
		
/*		Conta account2 = new Conta();
		account2.nomeTitular="Joaquim";
		account2.agencia=001;
		account2.numeroConta=4321;
		account2.saldo=10000;
		account2.dataAbertura="12/12";
		
		System.out.println(account2.recuperarDadosParaImpressao());

		System.out.println("\n");		
	
		Conta account3 = new Conta();		
		account3=account;
		
		if (account == account3) {
			System.out.println("Contas Iguais");			
		} else {
			System.out.println("Contas Diferentes");
		}
*/	
	}

}
