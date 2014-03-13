package com.nathanael.controllers.customerControllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.nathanael.controllers.cutomerControllers.CustomerMenuController;
import com.nathanael.customer.Customer;
import com.nathanael.customer.CustomerDao;
import com.nathanael.customer.CustomerMenu;

public class CustomerMenuControllerTests {
	private CustomerMenuController customerMenuController;
	@Mock ModelMap model;
	@Mock CustomerMenu menu;
	@Mock ModelAndView modelView;
	@Mock Customer customer;
	@Mock CustomerDao cus;
	
	@Before
	public void setup(){
		customerMenuController = new CustomerMenuController();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testPopulateAgeList(){
		
		List<Integer> list = customerMenuController.populateAgeList();
		
		assertNotNull(list);
		assertEquals(54, list.size());
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
		
				
		ModelAndView mav = customerMenuController.addCustomer(model);
		
		
		assertEquals(mav.getModel().get("ageList"),getAgeList());
		
	}
	@Test
	public void testSubmitCustomer(){
				
		ModelAndView mav = customerMenuController.submitCustomer(customer, model);
		
		assertEquals(mav.getViewName(), "customerMenu");
		assertEquals(mav.getModel(), model);
		
	}
	
	@Test
	public void testViewCustomers(){

		ModelAndView mav = customerMenuController.viewCustomers(model);
		assertNotNull(mav);
		assertEquals(mav.getViewName(), "viewCustomers");
		
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
