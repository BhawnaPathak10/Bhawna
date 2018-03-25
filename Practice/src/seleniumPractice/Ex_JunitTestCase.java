package seleniumPractice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Ex_JunitTestCase {

	@Before
	public void setUp() throws Exception {
		System.out.println("Am in setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Am in tear down method");
	}

	@Test
	public void a() {
		System.out.println("A");
		 assertEquals("sum does not match",10,15-5);
	}
	
	@Test
	public void c() {
		System.out.println("C");
		 assertEquals(20, 15 + 5);
	}

	@Test
	public void b() {
		System.out.println("B");
		 assertEquals(20, 15 + 5);
	}

}
