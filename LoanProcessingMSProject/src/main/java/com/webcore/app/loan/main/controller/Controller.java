package com.webcore.app.loan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.model.LoanDetails;
import com.webcore.app.loan.main.service.ServiceInter;

@CrossOrigin("*")
@RestController
@RequestMapping("/loanDetails")
public class Controller {
	
	@Autowired
	ServiceInter si;
	
	@RequestMapping(value="/details",method = RequestMethod.POST)
	public String saveData(@RequestBody LoanDetails gd)
	{
		System.out.println("i m in controller");
		LoanDetails grd = si.saveData(gd);
		//return grd;
		return "success";
	}
	
	
	@RequestMapping(value="/getdetails",method = RequestMethod.GET)
	public List<LoanDetails> getData()
	{
		List<LoanDetails> l = si.getData();
		System.out.println("i m in get mapping");
		return l;
	}

}
