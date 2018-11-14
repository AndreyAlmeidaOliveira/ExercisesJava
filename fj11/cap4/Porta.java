package fj11.cap4;

public class Porta {
	boolean aberta = true;
	String cor = "white";
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	public void abre() {
		this.aberta=true;
//		System.out.println("Aberta");
	}
	public void fecha() {
		this.aberta=false;
//		System.out.println("Fechada");
	}
	public void pinta(String cor) {
		this.cor=cor;
		System.out.println("Cor "+cor);
	}
	public void estaAberta() {
		if (aberta == true) {
			System.out.println("Porta Aberta!");
		} else {
			System.out.println("Porta Fechada!");
		}
	}

	public void status () {
		System.out.println("A porta está: "+this.aberta+"\nCor: "+this.cor); 
//		return status;
	}
}
