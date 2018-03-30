package ravi.gorebal;

import static org.junit.Assert.*;
import org.junit.Test;

public class CubeTest {	
	@Test
	public void test(){		
		JunitTesting junittesting = new JunitTesting();
		int number = junittesting.cube(3);
		assertEquals(27,number);		
	}
}
