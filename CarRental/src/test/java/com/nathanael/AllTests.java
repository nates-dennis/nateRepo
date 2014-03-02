package com.nathanael;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCustomer.class, TestVehicle.class, TestRenting.class })
public class AllTests {

}
