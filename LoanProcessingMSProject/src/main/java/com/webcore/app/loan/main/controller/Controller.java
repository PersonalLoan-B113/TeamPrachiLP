package com.webcore.app.loan.main.controller;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.exception.CustomExceptionClasses.DataAlreadyCalculated;
import com.webcore.app.loan.main.model.LoanDetails;
import com.webcore.app.loan.main.service.ServiceInter;

@CrossOrigin("*")
@RestController
@RequestMapping("/loanDetails")
public class Controller {
	
	@Autowired
	ServiceInter si;
	
	@RequestMapping(value="/details",method = RequestMethod.POST)
	public ResponseEntity<String> saveData(@RequestBody LoanDetails gd) throws DataAlreadyCalculated
	{
		System.out.println("i m in controller");
		List<LoanDetails> l = si.getData();
		int count =0;
		String respMsg="Error";
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		for(LoanDetails ld : l)
		{
			if((ld.getLeadId()==gd.getLeadId())&& (gd.getStatusCode()>=300||gd.getStatusCode()<300))
			{
				count=1;
				throw new DataAlreadyCalculated("For "+ld.getLeadId()+" loan already Created or loan is yet to be calculated "); 
				
			}
		}
		if(count==0)
		{
		LoanDetails grd = si.saveData(gd);
		System.out.println(gd.getStatusCode());
		System.out.println("i m in post");
				httpStatus=HttpStatus.CREATED;
				return new ResponseEntity<String>("success",httpStatus);
		}
		return new ResponseEntity<String>(respMsg,httpStatus);
	}
	
	
	@RequestMapping(value="/getdetails",method = RequestMethod.GET)
	public List<LoanDetails> getData()
	{
		List<LoanDetails> l = si.getData();
		System.out.println("i m in get mapping");
		return l;
	}

}
