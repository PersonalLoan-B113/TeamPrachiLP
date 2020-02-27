package com.webcore.app.loan.main.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.service.IHomeService;

@CrossOrigin("*")
@RestController
public class HomeController {
	@Autowired
	IHomeService ihoHomeService;

	@PostMapping("/saveTenure")
	public Tenure save(@RequestBody Tenure tenure) 
	{
		
		System.out.println(tenure.getNoofyears());
		ihoHomeService.saveTenure(tenure);
		return tenure;
	}

	@GetMapping("/getTenure/{tenureId}")
	public Tenure getData(@PathVariable("tenureId") int tenureId) {
		return ihoHomeService.getTenureByID(tenureId);

	}
	@GetMapping("/getTenure1")
	public List<Tenure> getData(@RequestBody Tenure tenure) {
		 return ihoHomeService.getTenure();

	}

	@DeleteMapping("/deleteTenure/{tenureId}")

	public void deleteData(@PathVariable("tenureId")int tenureId) {
		// TODO Auto-generated method stub
		ihoHomeService.deleteTenure(tenureId);
	}

	@PutMapping("/editTenure/{tenureId}")
	public Tenure editData(@PathVariable("tenureId")int tenureId,@RequestBody Tenure tenure) {
		// TODO Auto-generated method stub
		ihoHomeService.updateTenure(tenure);
		return new Tenure();
	}

	
	}
