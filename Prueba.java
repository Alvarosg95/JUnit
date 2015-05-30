import static org.junit.Assert.*;
import org.junit.*;

public class Prueba {
	private BinaryString bitset1, bitset2, bitset3;
	private String stringPrueba2 = "1010101010";
	private String stringPrueba3 = "100101";

	@Before
	public void antes() {
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(stringPrueba2);
		bitset3 = new BinaryString(stringPrueba3);
	}

	// Comprueba que al crear un bitset de longitud N con cada uno de los dos
	// constructores, la longitud es realmente N
	@Test
	public void testLength() {
		assertEquals(10, bitset1.length());
		assertEquals(10, bitset2.length());
	}

	// Comprueba que al poner '1' el bit número 2 del bitset cuyo contenido es
	// "100101" dicho bit tiene ese valor
	@Test
	public void testSetBit() {
		bitset3.set(1, '1');
		assertEquals('1', bitset3.get(1));
	}
}
