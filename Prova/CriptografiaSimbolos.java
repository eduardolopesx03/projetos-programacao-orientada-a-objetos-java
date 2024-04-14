package prova;

public class CriptografiaSimbolos extends Criptografia {
	private char[] SYMBOL = {'!','?','&','@','#','$','%','*','>','<','=','+','-','/','{','}','[','§',';','a','o','^','~','_',':',']'};

	@Override
	public String criptografar(String palavra) {
		StringBuilder palavraCriptografada = new StringBuilder();

		for(int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);
			if(Character.isUpperCase(letra)) {
				int posicao = letra - 'A';
				palavraCriptografada.append(SYMBOL[posicao]);
			} else {
				palavraCriptografada.append(letra);
			}
		}

		return palavraCriptografada.toString();
	}

	public char[] getSYMBOL() {
		return SYMBOL;
	}
}
