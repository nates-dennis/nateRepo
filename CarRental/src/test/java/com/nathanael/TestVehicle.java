package com.nathanael;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.nathanael.vehicle.Vehicle.VehicleType;

public class TestVehicle extends TestUtil{
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		vMenu = null;
	}

	@Test
	public void testAdd() {
		addV();
		assertTrue(getVehicles().size() == 2);
	}
	
	@Test
	public void testRemove(){
		addV();
		vMenu.removeVehicle(van);
		assertTrue(vMenu.getVehicles().size() == 1);
	}
	
	@Test
	public void testAssign(){
		addV();
		assign();
		assertEquals(VehicleType.ESTATE.name(), getVehicles().get(1).getType());
	}

}
