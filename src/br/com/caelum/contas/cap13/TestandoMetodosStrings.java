package br.com.caelum.contas.cap13;

public class TestandoMetodosStrings {

	public static void main(String[] args) {
		String str = "hello";
		// String strs = "world";

		str.concat(" world");
		str += " from Java";

		System.out.println(str);

		String letra = "";
		for (int i = 0; i < 65536; i++) {
			letra += "a";
			// System.out.println(letra);
		}
	}
	

}
