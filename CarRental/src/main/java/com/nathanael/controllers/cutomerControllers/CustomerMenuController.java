package com.nathanael.controllers.cutomerControllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nathanael.customer.Customer;
import com.nathanael.customer.CustomerMenu;


@Controller
public class CustomerMenuController {
	
	@RequestMapping("/CustomerMenu")
	public ModelAndView cutomerMenu(ModelMap model, CustomerMenu customerMenu) {
		List<Customer> customers = customerMenu.getCustomers();
		if(!(customers.size() == 0)){
			model.put("Customers", customers);
		}
		
		return new ModelAndView("customerMenu", "customers",model);
 
	}
	
	@RequestMapping("/CustomerMenu/AddCustomer")
	public ModelAndView addCustomer(ModelMap model, @ModelAttribute Customer customer) {
		
		
		List<Integer> ageList = new ArrayList<Integer>();
		
		for(int i = 16; i < 70; i++){
			ageList.add(i);
		}
		model.put("ageList", ageList);
		
		return new ModelAndView("addCustomer", "ageList",model);
 
	}
	
	@RequestMapping("/CustomerMenu/ViewCustoemrs")
	public ModelAndView viewCustomers(ModelMap model) {


		return new ModelAndView("viewCustomers", "customers",model);
 
	}
	
}
