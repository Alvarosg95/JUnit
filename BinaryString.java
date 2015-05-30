import java.util.Random;

public class BinaryString {
	private char[] bits;

	public BinaryString(int numberOfBits) {
		bits = new char[numberOfBits];

		Random random = new Random();

		for (int i = 0; i < numberOfBits; i++) {
			if (random.nextDouble() < 0.5) {
				bits[i] = '1';
			} else {
				bits[i] = '0';
			}
		}
	}

	public BinaryString(String bits) {
		this.bits = bits.toCharArray();
	}

	public int length() {
		return bits.length;
	}

	public void set(int index, char value) {
		if (index < 0 || index >= bits.length) {
			throw new BinaryStringException("Fallo en el index");
		}
		bits[index] = value;
	}

	public char get(int index) {
		if (index < 0 || index >= bits.length) {
			throw new BinaryStringException("Fallo por index en el get");
		}
		return bits[index];
	}

	public String toString() {
		String result = " ";

		for (int i = 0; i < bits.length; i++) {
			if (bits[i] == 1) {
				result += "1";
			} else {
				result += 0;
			}
		}

		return result;
	}
}
