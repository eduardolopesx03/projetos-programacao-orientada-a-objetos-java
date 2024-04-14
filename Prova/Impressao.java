package prova;

public class Impressao {

	public void imprime(String str) {
		System.out.println(str);
	}

	public void imprime(char[] arr) {
		System.out.println(arr);
	}

	public void imprime(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

