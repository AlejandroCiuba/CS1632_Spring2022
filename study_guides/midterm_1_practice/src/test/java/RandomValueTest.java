
import static org.junit.Assert.*;

import java.util.Random;

import org.junit.*;
import org.mockito.*;

public class RandomValueTest {
	RandomValue value;
	Random rand;

	@Before
	public void setUp() {
		rand = Mockito.mock(Random.class);
		value = new RandomValue(rand);
	}
	
	@Test
	public void testIncValNone() {
		Mockito.when(rand.nextInt(2)).thenReturn(0);
		value.incVal();
		assertEquals(0, value.getVal());
	}
	
	@Test
	public void testIncValOnce() {
		Mockito.when(rand.nextInt(2)).thenReturn(1);
		value.incVal();
		assertEquals(1, value.getVal());
	}

	@Test
	public void testIncValTwice() {
		Mockito.when(rand.nextInt(2)).thenReturn(1);
		value.incVal();
		value.incVal();
		assertEquals(2, value.getVal());
	}
}
