package com.nathanael.controllers.customerControllers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.verification.VerificationMode;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.nathanael.controllers.cutomerControllers.CustomerMenuController;
import com.nathanael.customer.Customer;
import com.nathanael.customer.CustomerMenu;

public class CustomerMenuTests {
	private CustomerMenuController customerMenuController;
	@Mock ModelMap model;
	@Mock CustomerMenu menu;
	@Mock ModelAndView modelView;
	@Mock Customer customer;
	@Before
	
	public void setup(){
		customerMenuController = new CustomerMenuController();
		MockitoAnnotations.initMocks(this);
	}
		
	@Test
	public void testGetCustoemrs(){
		Mockito.when(menu.getCustomers()).thenReturn(getCustomers());
		Mockito.when(modelView.getViewName()).thenReturn("customerMenu");
		
		ModelAndView view = customerMenuController.cutomerMenu(model, menu);
		
		Mockito.verify(menu, Mockito.atLeastOnce()).getCustomers();
		
		
		assertEquals(view.getViewName(), "customerMenu");
		assertEquals(view.getModel().get("customers"), model);
	}
	
	@Test
	public void testAddCustomers(){
		
//		Mockito.when(model.get("ageList")).thenReturn(getAgeList());
				
		ModelAndView mav = customerMenuController.addCustomer(model, customer);
		
//		Mockito.verify(model).get("ageList");
		
		assertEquals(mav.getModel().get("ageList"),getAgeList());
		
	}
	
	private List<Integer> getAgeList() {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 16; i < 70; i++){
			list.add(i);
		}
		return list;
	}

	private List<Customer> getCustomers(){
		List<Customer> list = new ArrayList<Customer>();
		list.add( new Customer("nat", "Den", 10, "ealing"));
		list.add( new Customer("sar", "stew", 20, "ealing"));
		list.add( new Customer("Bil;", "jone", 15, "acton"));
		list.add(new Customer("Ben", "jon", 8, "acton"));
		return list;
	}

}
