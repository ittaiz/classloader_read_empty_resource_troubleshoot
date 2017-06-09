package com.example;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class ReadClassLoaderTest {

	@Test
	public void someTest() {
		assertNotNull(getClass().getClassLoader().getResource(""));
	}

	@Test
	public void someTest2() {
		assertNotNull(ReadClassLoader.resource);
	}
	
}