package com.webcore.app.loan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.model.CustomerDetails;
import com.webcore.app.loan.main.service.ServiceInter;

@RestController
@RequestMapping(value = "/exceptionHandling")
@CrossOrigin("*")
public class ExceptionController {
	
	@Autowired 
	ServiceInter si;
	
	@RequestMapping(value = "/getData",method = RequestMethod.GET)
	public List<CustomerDetails> getDetails()
	{
		List<CustomerDetails> li = si.getDetails();
		return li;
		
	}
	
	
	

}
