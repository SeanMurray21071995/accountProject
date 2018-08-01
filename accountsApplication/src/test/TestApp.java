package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.App;

public class TestApp {
	@Test
	public void testHelloWorld() {
		App a = new App();
		assertEquals("Error runnig the hello world function","Hello world",a.helloWorld());
	}
}
