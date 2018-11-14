package fj11.cap5;

public class Account {
	String titular;
	int numero;
	double saldo;
	private static int totalContas = 0;

	// construtor
	Account() {
		Account.totalContas = Account.totalContas + 1;
		// this.titular = cliente;
		// System.out.println("Construindo uma conta!");
		// this.titular = "João";
	}

	public static int getTotalContas() {
		return Account.totalContas;
	}

	public static void setTotalContas(int totalContas) {
		Account.totalContas = totalContas;
	}
}
