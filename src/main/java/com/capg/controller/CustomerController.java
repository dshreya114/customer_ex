package com.capg.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.capg.entities.Customer;
import com.capg.service.ICustomerService;

@Controller
public class CustomerController {

	private static Logger Log= LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping("/register")
	public ModelAndView registerPage()
	{
		return  new ModelAndView("customerRegister") ;
	}
	
	@GetMapping("/processregister")
    public ModelAndView registerCustomer(
    		@RequestParam("custId") int custId ,
    		@RequestParam("custName")  String custName)
	{
       Customer  customer=new Customer();
       customer.setCustId(custId);
       customer.setCustName(custName);
        customer = customerService.update(customer);
        return new ModelAndView("customerDetails",  "customer", customer);
    }
}
