package skunk.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPredictableDie {

	@Test
	void test_PD_1_2_3() {
		PredictableDie die = new PredictableDie(new int[] {1, 2, 3});
		die.roll();
		assertEquals(1, die.getLastRoll());
		die.roll();
		assertEquals(2, die.getLastRoll());
	}

}
