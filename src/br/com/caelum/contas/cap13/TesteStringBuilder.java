package br.com.caelum.contas.cap13;

public class TesteStringBuilder {

	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder();
		long timeStart = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			strBuilder.append("a");
		}

		long timeEnd = System.currentTimeMillis();
		long timeResult = timeEnd - timeStart;

		System.out.println("Tempo de Execução com String Builder: " + timeResult + " ms");
	}

}
