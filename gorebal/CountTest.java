package ravi.SamplePrograms.gorebal;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountTest {

	@Test
	public void test() {
		JunitTesting junittesting = new JunitTesting();
		int count = junittesting.countA("aluraaaaa");
		assertEquals(6, count);
	}

}
