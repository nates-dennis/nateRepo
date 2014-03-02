package com.nathanael;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import com.nathanael.rent.RentalMenu;
import com.nathanael.vehicle.Vehicle.Status;

public class TestRenting extends TestUtil {

	private RentalMenu rm;
	
	
	@Before
	public void setUp() throws Exception {
		rm = new RentalMenu();
		addC();
		addV();
	}

	@After
	public void tearDown() throws Exception {
		rm = null;
	}

	@Test
	public void testRent() {
		
		assertTrue(getVehicles().get(0).getStatus().equals(Status.AVAILABLE.name()));
		rm.rent(getVehicles().get(0), getCustomers().get(0));
		rm.calculateDiscount();
		assertEquals(1,rm.getRented().size());
		assertTrue(getVehicles().get(0).getStatus().equals(Status.RENTED.name()));
		
	}

}
