package prova;

public class CriptografiaNumerica extends Criptografia {

	private static int[] NUMBERS = new int[getAlpha().length];

	public CriptografiaNumerica() {
		for (int i = 0; i < NUMBERS.length; i++) {
			NUMBERS[i] = i + 1;
		}
	}

	@Override
	public String criptografar(String message) {
		StringBuilder encryptedMessage = new StringBuilder();
		for (char c : message.toCharArray()) {
			if (Character.isLetter(c)) {
				int number = Character.toUpperCase(c) - 'A' + 1;
				encryptedMessage.append(number).append('.');
			} else {
				encryptedMessage.append(c);
			}
		}
		return encryptedMessage.toString();
	}

	@Override
	public String descriptografar(String encryptedMessage) {
		StringBuilder message = new StringBuilder();
		String[] parts = encryptedMessage.split("\\.");
		for (String part : parts) {
			int number = Integer.parseInt(part);
			char c = (char) ('A' + number - 1);
			message.append(c);
		}
		return message.toString();
	}

	public static int[] getNumbers() {
		return NUMBERS;
	}
}

