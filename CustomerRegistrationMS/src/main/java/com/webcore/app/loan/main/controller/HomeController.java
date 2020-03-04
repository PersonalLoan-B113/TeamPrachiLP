package com.webcore.app.loan.main.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webcore.app.loan.main.dto.CustomerStatusAndId;
import com.webcore.app.loan.main.model.CustomerDetails;
import com.webcore.app.loan.main.model.CustomerDetailsSubset;
import com.webcore.app.loan.main.service.HomeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/customerDetails")
public class HomeController {

	@Autowired
	HomeService hs;
	
	  @RequestMapping(value = "/reg", method = RequestMethod.POST) 
	  public CustomerDetails register(@RequestBody CustomerDetails cd) 
	  {
		  hs.saveData(cd); 
		  return cd;
	  
	  }
	 
	  List<CustomerDetails> custdet;
	  List<CustomerDetailsSubset> listOfCustSub = new ArrayList<CustomerDetailsSubset>();
	  int count=0;
	  
	  @RequestMapping(value = "/getCustomerDetails",method = RequestMethod.GET) 
	  public List<CustomerDetailsSubset> getAllData() {
		  
	  System.out.println("i m in get all data");
	  if(count==0)
	  {
		custdet=null;
	  custdet = hs.getCustomerData(); 
	  count=1;
	  
	  
	  for(CustomerDetails cd : custdet)
	  {
		  CustomerDetailsSubset cds = new CustomerDetailsSubset();  
	  
		  cds.setCustId(cd.getCustId());
		  cds.setLeadId(cd.getLeadId());
		  cds.setLoanAmount(cd.getLoanAmount());
		  cds.setLoanNo(cd.getLoanNo());
		  cds.setStatusCode(Integer.parseInt(cd.getStatusCode()));
		  listOfCustSub.add(cds);
			/*
			 * if(Integer.parseInt(cd.getStatusCode())>=302) {
			 * System.out.println(cd.getStatusCode()+"  added to above 302");
			 * listOfCustAbove302.add(cds); List<CustomerDetailsSubset> l=
			 * getAbove302(listOfCustAbove302); } else
			 * if(Integer.parseInt(cd.getStatusCode())<300) {
			 * System.out.println(cd.getStatusCode()+"  added to below 302");
			 * listOfCustbelow300.add(cds) ; } else {
			 * System.out.println(cd.getStatusCode()+"  added to between 300");
			 * listOfCustbtw300.add(cds); }
			 */
		  
	  }
	  }
	  System.out.println("between 300 : "+listOfCustSub.size());
	  
	  return listOfCustSub;
	  }
	/*
	 * public List<CustomerDetailsSubset> getAbove302(List<CustomerDetailsSubset> l)
	 * { return l; }
	 * 
	 * public List<CustomerDetailsSubset> getBtwn300(List<CustomerDetailsSubset> l)
	 * { return l; }
	 * 
	 * public List<CustomerDetailsSubset> getBelow300(List<CustomerDetailsSubset> l)
	 * { return l; }
	 */
	 
	  @RequestMapping(value = "/getCustomerAbove302",method = RequestMethod.GET) 
	  public List<CustomerDetailsSubset> getDataAbove302() {
		  List<CustomerDetailsSubset> listOfCustAbove302 = new ArrayList<CustomerDetailsSubset>();
		  
		  for(CustomerDetailsSubset cd1 : listOfCustSub)
		  {
			  CustomerDetailsSubset cds = new CustomerDetailsSubset();
			  cds = cd1;
			  if(cd1.getStatusCode()>=302)
			  {
				  System.out.println(cd1.getCustId()+"  added to above 302");
				  listOfCustAbove302.add(cds);
			  }  
		  }
		  
		  System.out.println("Above 302 : "+listOfCustAbove302.size());
		  return listOfCustAbove302;
	  }
	  
	  @RequestMapping(value = "/getCustomerBtwn300",method = RequestMethod.GET)  
	  public List<CustomerDetailsSubset> getDataBtwn300() {
		  List<CustomerDetailsSubset> listOfCustbtw300 = new ArrayList<CustomerDetailsSubset>();
		  
		  for(CustomerDetailsSubset cd1 : listOfCustSub)
		  {
			  CustomerDetailsSubset cds = new CustomerDetailsSubset();
			  cds=cd1;
			  if((cd1.getStatusCode()<302) && (cd1.getStatusCode()>=300) )
			  {
				  System.out.println(cd1.getCustId()+"  added to above 302");
				  listOfCustbtw300.add(cds);
			  }  
		  }
		  
		  System.out.println("Between 300 : "+listOfCustbtw300.size());
		  return listOfCustbtw300;
	  }
	  
	  @RequestMapping(value = "/getCustomerBelow300",method = RequestMethod.GET) 
	  public List<CustomerDetailsSubset> getDataBelow300() {
		  List<CustomerDetailsSubset> listOfCustbelow300 = new ArrayList<CustomerDetailsSubset>();
		  for(CustomerDetailsSubset cd1 : listOfCustSub)
		  {
			  CustomerDetailsSubset cds = new CustomerDetailsSubset();
			  
			  cds=cd1;
			  if(cd1.getStatusCode()<300)
			  {
				  System.out.println(cd1.getCustId()+"  added to above 302");
				  listOfCustbelow300.add(cds);
			  }  
		  }
		  
		  System.out.println("Below300 : "+listOfCustbelow300.size());
		  return listOfCustbelow300;
	  }
	  
	  public CustomerDetails findObjectById(int custId)
	  {
		  System.out.println("finding by id");
		  return hs.getCustomer(custId);
		  
	  }
	  
	  @RequestMapping(value="/updateStatus", method = RequestMethod.PUT)
	  public void updateStatus(@RequestBody CustomerStatusAndId csid)
	  {
		  CustomerDetails cd = findObjectById(csid.getCustId());
		  cd.setStatusCode(csid.getStatusCode()+"");
		  System.out.println("CustId : "+cd.getCustId());
		  System.out.println("Updated Status Code " +cd.getStatusCode());
		  hs.saveData(cd);
		  count =0;
	  }
}
