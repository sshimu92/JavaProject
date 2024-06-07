package miniFrameWork;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases { // TestNG --> is a Testing framework (Which is a updated version of a JUnit(build in java framework)).

	public int add() {

		int sum = 7 + 8;

		return sum;
	}

	@Test
	public void test() {

		assertEquals(15, add());
	}
	
}
