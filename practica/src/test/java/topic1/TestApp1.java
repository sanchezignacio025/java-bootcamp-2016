package topic1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApp1 {

	@Test
	public void testPrintHelloNacho() {

		assertTrue(App1.getHelloNacho().equals("Hello Nacho"));

	}
}
