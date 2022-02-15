
import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class SquareTest {

	/*
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 */
	@Test
	public void testSetSquared() {
		// TODO: Fill in!
		// Integration Test
		Square square = new Square();
		Number number = new Number();

		square.setSquared(number, 3);
		assertEquals(9, number.getVal());

		// Unit Testing
		Number n = Mockito.mock(Number.class);
		square.setSquared(n, 3);
		Mockito.verify(n, Mockito.times(1)).setVal(9); // IMPORTANT
	}

}
