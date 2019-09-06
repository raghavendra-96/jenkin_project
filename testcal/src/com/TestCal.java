package com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCal {
private Calculator c;
	@Before
	public void setUp() throws Exception {
	c=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		c=null;
	}

	@Test
	public void testAdd() {
		
		int i=c.add(6, 3);
		assert i<5:"result should not  be greater than 5";
	}

	@Test
	public void testSub() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testMul() {
		System.out.println("Not yet implemented");
	}

}
