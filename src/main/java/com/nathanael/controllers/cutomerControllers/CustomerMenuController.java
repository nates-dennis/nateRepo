package com.nathanael.controllers.cutomerControllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nathanael.customer.Customer;
import com.nathanael.customer.CustomerMenu;

//nates updates
@Controller
@RequestMapping("/CustomerMenu")
public class CustomerMenuController {
	
	@Autowired
	CustomerMenu menu;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView cutomerMenu(ModelMap model, CustomerMenu customerMenu) {
//		menu = new CustomerMenu();
		List<Customer> customers = menu.getCustomers();
		if(!(customers.size() == 0)){
			model.put("Customers", customers);
		}
		
		return new ModelAndView("customerMenu", "customers",model);
 
	}
	
	@ModelAttribute("ageList")
	public List<Integer> populateAgeList(){
		List<Integer> ageList = new ArrayList<Integer>();
		for(int i = 16; i < 70; i++){
			ageList.add(i);
		}
		return ageList;
	}
	
	@RequestMapping(value = "/AddCustomer", method = RequestMethod.GET)
	public ModelAndView addCustomer(ModelMap model) {
		
		model.addAttribute("customer", new Customer());

		return new ModelAndView("customer/AddCustomer",model);
 
	}
	
	@RequestMapping(value = "/AddCustomer", method = RequestMethod.POST)
	public ModelAndView submitCustomer(@ModelAttribute Customer customer, ModelMap model) {
		
		menu.addCustomer(customer);
//		List<Customer> list = menu.getCustomers();
		return new ModelAndView("customerMenu",model);
 
	}
	
	@RequestMapping("/ViewCustomers")
	public ModelAndView viewCustomers(ModelMap model) {

		model.addAttribute("customers", menu.getCustomers());
		model.addAttribute("test", 34);
		return new ModelAndView("customer/ViewCustomer",model);
 
	}
	
}
