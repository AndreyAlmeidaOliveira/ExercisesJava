package fj11.cap4;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class TestePorta {
	public static void main(String[] args) {
		Porta door = new Porta();
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Escolha uma opção: \n [1] abre\n [2] fecha\n [0] sair\n");
			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				door.abre();
				break;
			case 2:
				door.fecha();
				break;
			case 3:
				door.status();
				break;
			case 0:
				break;
			default: 
				System.out.println("Opção Inválida");
			}
		} while (true);

	}
}
