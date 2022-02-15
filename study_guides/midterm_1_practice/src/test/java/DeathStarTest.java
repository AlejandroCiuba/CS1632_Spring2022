import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class DeathStarTest {

	/*
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: shoot planet with deathStar
	 * PostConditions: Return value of deathStar.shoot(planet) is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 */
	@Test
	public void testShootPlanet() {
		// TODO: Fill in!
		// Integration Test
		DeathStar deathstar = new DeathStar();
		Planet planet = new Planet(10);

		assertEquals("Wimpy planet was hit by the superlaser!", deathstar.shoot(planet));
		assertEquals(-90, planet.getHitPoints());

		// Unit Test
		deathstar = new DeathStar();
		Planet p = Mockito.mock(Planet.class);
		Mockito.when(p.getHitPoints()).thenReturn(10);
		Mockito.when(p.toString()).thenReturn("Wimpy planet");

		assertEquals("Wimpy planet was hit by the superlaser!", deathstar.shoot(p));
		Mockito.verify(p, Mockito.times(1)).damage(100);
	}
}
