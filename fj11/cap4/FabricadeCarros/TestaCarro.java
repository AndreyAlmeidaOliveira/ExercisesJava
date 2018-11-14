package FabricadeCarros;

public class TestaCarro {
	public static void main (String [] args) {
		Carro car01 = new Carro();
		Motor engine = new Motor();
		
		car01.cor="branco";
		car01.modelo="Porche";
		car01.velocidadeAtual = 0;
		car01.velocidadeMaxima = 80;
		car01.motor=engine;
		car01.motor.potencia = 2000;
		car01.motor.tipo="Turbo";
		
		car01.liga();
		
		car01.acelera(20);
		System.out.println(car01.velocidadeAtual);
		System.out.println("Modelo: "+car01.modelo+"\nTipo: "+car01.motor.tipo+"\nPotência: "+car01.motor.potencia+"cc");
		
	}
}
