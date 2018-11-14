package fj11.cap4;

import java.util.Scanner;

public class TestePessoa {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		Pessoa person = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		person.nome = input.nextLine();		
		System.out.println("Digite a sua idade: ");
		person.idade = input.nextInt();
		
		
		
		System.out.println("Olá "+person.nome);
		person.fazAniversario(person.idade);
	}

}
