import static org.junit.Assert.*;
import org.junit.*;

public class Prueba {
	private BinaryString bitset1, bitset2, bitset3, bitset4;
	private String stringPrueba2 = "1010101010";
	private String stringPrueba3 = "100101";
	private String stringPrueba4 = "0110101";

	@Before
	public void antes() {
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(stringPrueba2);
		bitset3 = new BinaryString(stringPrueba3);
		bitset4 = new BinaryString(stringPrueba4);
	}

	// Comprueba que al crear un bitset de longitud N con cada uno de los dos
	// constructores, la longitud es realmente N
	@Test
	public void testLength() {
		assertEquals(10, bitset1.length());
		assertEquals(10, bitset2.length());
	}

	// Comprueba que al poner '1' el bit n�mero 2 del bitset cuyo contenido es
	// "100101" dicho bit tiene ese valor
	@Test
	public void testSetBit() {
		bitset3.set(1, '1');
		assertEquals('1', bitset3.get(1));
	}

	// Comprueba que si se quiere obtener el valor del bit 56 de un bitset con
	// el contenido "0110101" se devuelve una excepci�n de tipo
	// BinaryStringException.class
	@Test(expected = BinaryStringException.class)
	public void testGetOutOfLimitBit() {
		bitset4.get(56);
	}
}
