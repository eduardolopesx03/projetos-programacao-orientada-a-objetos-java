package prova;

import java.util.Arrays;

public class Executar {
	public static void main(String[] args) {
		Impressao i = new Impressao();
		CriptografiaNumerica criptografiaNumerica = new CriptografiaNumerica();
		CriptografiaSimbolos criptografiaSimbolos = new CriptografiaSimbolos();

		String palavra = "ALUNO";

		System.out.println(Criptografia.getAlpha());

		System.out.println(Arrays.toString(CriptografiaNumerica.getNumbers()));

		System.out.println(criptografiaSimbolos.getSYMBOL());

		System.out.println("Palavra origem " + palavra);

		// Cifra de César
		Criptografia criptografiaCesar = new Criptografia();
		String palavraCriptografada1 = criptografiaCesar.criptografar(palavra);
		System.out.println("Palavra criptografada 1 (Cifra de Ceasar) -> " + palavraCriptografada1);
		String palavraDescriptografada1 = criptografiaCesar.descriptografar(palavraCriptografada1);
		System.out.println("Palavra descriptografada 1 (Cifra de Ceasar) -> " + palavraDescriptografada1);

		// Criptografia numérica
		String palavraCriptografada2 = criptografiaNumerica.criptografar(palavra);
		System.out.println("Palavra criptografada 2 (Numérica) -> " + palavraCriptografada2);

		// Criptografia de símbolos
		String palavraCriptografada3 = criptografiaSimbolos.criptografar(palavra);
		System.out.println("Palavra criptografada 3 (Símbolos) -> " + palavraCriptografada3);
	}
}
