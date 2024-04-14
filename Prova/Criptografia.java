package prova;

public class Criptografia {

	private static char[] ALPHA = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
			'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

	public static char[] encrypt() {
		char[] result = new char[ALPHA.length];
		for (int i = 0; i < ALPHA.length; i++) {
			result[i] = ALPHA[(i + 3) % ALPHA.length];
		}
		return result;
	}

	public String criptografar(String palavra) {
		StringBuilder palavraCriptografada = new StringBuilder();
		for (int i = 0; i < palavra.length(); i++) {
			char c = palavra.charAt(i);
			if (Character.isLetter(c)) {
				char letraCriptografada = (char) (((c - 'A' + 3) % 26) + 'A');
				palavraCriptografada.append(letraCriptografada);
			} else {
				palavraCriptografada.append(c);
			}
		}
		return palavraCriptografada.toString();
	}


	public String descriptografar(String encryptedMessage) {
		char[] alphaShifted = encrypt();
		StringBuilder message = new StringBuilder();
		for (char c : encryptedMessage.toCharArray()) {
			if (Character.isLetter(c)) {
				int unshiftedIndex = (Character.toUpperCase(c) - 'A' + ALPHA.length - 3) % ALPHA.length;
				char unshiftedChar = Character.isUpperCase(c) ? ALPHA[unshiftedIndex] : Character.toLowerCase(ALPHA[unshiftedIndex]);
				message.append(unshiftedChar);
			} else {
				message.append(c);
			}
		}
		return message.toString();
	}

	public static char[] getAlpha() {
		return ALPHA;
	}
}
