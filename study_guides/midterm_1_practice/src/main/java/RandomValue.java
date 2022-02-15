

import java.util.Random;

public class RandomValue {
	private int val = 0;
	private Random rand = null;

	public RandomValue() {
		this(new Random());
	}

	public RandomValue(Random rand) {
		this.rand = rand;
	}

	public void incVal() {
		val += rand.nextInt(2);
	}

	public int getVal() {
		return val;
	}
}