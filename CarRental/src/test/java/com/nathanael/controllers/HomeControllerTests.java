package com.nathanael.controllers;

import static org.junit.Assert.*;

import java.util.Map;







import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

public class HomeControllerTests {
	
	private HomeController homeController;
	@Mock ModelAndView andView;
	@Mock Model model;
	
	@Before
	public void setup(){
		homeController = new HomeController();
		MockitoAnnotations.initMocks(this);
	}
		
	@Test
	public void testDisplayHome(){
				
		ModelAndView modelAndView = homeController.displayHome(model);
		
		assertEquals(modelAndView.getViewName(), "index");
	}

}
