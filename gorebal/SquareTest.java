package ravi.gorebal;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		JunitTesting ju = new JunitTesting();
		int outout = ju.square(5);
		
		assertEquals(25, outout);
	}

}
