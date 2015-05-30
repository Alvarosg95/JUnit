import static org.junit.Assert.*;
import org.junit.*;

public class Prueba {
	private BinaryString bitset1, bitset2;
	private String stringPrueba2 = "1010101010";

	@Before
	public void antes() {
		bitset1 = new BinaryString(10);
		bitset2 = new BinaryString(stringPrueba2);
	}

	// Comprueba que al crear un bitset de longitud N con cada uno de los dos
	// constructores, la longitud es realmente N
	@Test
	public void testLength() {
		assertEquals(10, bitset1.length());
		assertEquals(10, bitset2.length());
	}
}
