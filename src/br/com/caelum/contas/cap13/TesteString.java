package br.com.caelum.contas.cap13;

import java.util.Scanner;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteString {

	public static void main(String[] args) {
		String x = "string 1";
		String y = "String 2";

		System.out.println(x + "\n" + y);

		if (x.equalsIgnoreCase(y)) {
			System.out.println("equal");
		} else {
			System.out.println("diferent");
		}

		System.out.println("Value Compare: " + y.compareTo(x));
		Scanner input = new Scanner(System.in);
		// do {
		// System.out.println("1ª String: ");
		// x = input.next();
		//
		// System.out.println("2ª String: ");
		// y = input.next();

		switch (x.compareTo(y)) {
		case 0:
			System.out.println("Iguais");
			break;

		case -1:
			System.out.println("Anterior à String");
			break;

		case 1:
			System.out.println("Posterior à String");
			break;

		default:
			System.out.println("Não Reconhecido");
		}

		// } while (false);
		// toLowerCase()
		String palavra = "eagle 2";
		String outra = palavra.toLowerCase();
		System.out.println(outra);

		// toUpperCase()
		String word = "maiuscula";
		String other = word.toUpperCase();//transforma o conteúdo da String em minúscula
		System.out.println(other);

		// replace
		palavra = palavra.replace("2", "99");
		System.out.println(palavra);

		// toUpperCase() + replace()
		palavra = palavra.toUpperCase().replace("99", "47"); //transforma o conteúdo da String em maiúscula e encontra e substitui determinada conteúdo
		System.out.println(palavra);

		System.out.println(palavra.intern()); //?
		System.out.println(palavra.charAt(6)); //mostra o conteúdo da String a partir do indice informado
		System.out.println(palavra.length()); //mostra o tamanho da String
		System.out.println(palavra.substring(5)); //mostra o conteúdo do índice indicado
		System.out.println(palavra.indexOf("E")); //mostra o índice
		System.out.println(palavra.isEmpty());//mostra se está fazia
		
		Conta count = new ContaCorrente();
		Conta count2 = new ContaCorrente();
		count2 = count;
		
		System.out.println(count.equals(count));

	}

}