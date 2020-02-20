package com.webcore.app.loan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.model.LoanDetails;
import com.webcore.app.loan.main.service.ServiceInter;

@RestController
public class Controller {
	
	@Autowired
	ServiceInter si;
	
	@PostMapping("/details")
	public LoanDetails saveData(@RequestBody LoanDetails gd)
	{
		LoanDetails grd = si.saveData(gd);
		return grd;
	}
	
	@GetMapping("/getdetails")
	public List<LoanDetails> getData()
	{
		List<LoanDetails> l = si.getData();
		System.out.println("i m in get mapping");
		return l;
	}

}
