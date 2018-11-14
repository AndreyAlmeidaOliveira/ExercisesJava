package fj11.cap4;

//import java.util.*;

public class Pessoa {
//	Date date = new Date();
//	LocalDateTime now = LocalDateTime.now();
	
	String nome;
	int idade;
	
	public void fazAniversario(int idade) {
		int anoAtual = 2018; 
		System.out.println("Você nasceu em "+ (anoAtual - idade)); 
	}
}
