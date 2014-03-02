package com.nathanael;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCustomer extends TestUtil{
	

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testAdd() {
		assertTrue(getCustomers().size() == 0);
		addC();
		assertTrue(getCustomers().size() == 3);
	}
	
	@Test
	public void testRemove(){
		addC();
		assertTrue(getCustomers().size() == 3);
		removeC();
		assertTrue(getCustomers().size() == 2);
	}

}
