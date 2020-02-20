package com.webcore.app.loan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webcore.app.loan.main.model.Cibill;
import com.webcore.app.loan.main.service.HomeService;

@RestController
public class HomeController {
	/*
	 * @Autowired RestTemplate rt;
	 */
	@Autowired
	HomeService hs;

	@RequestMapping("/reg")
	public Cibill m1(@RequestBody Cibill c) {
		hs.saveData(c);
		/*
		 * String url="http://zuul/getadd"; rt.getForObject(url,String.class);
		 */ return c;
	}
	@RequestMapping("/fetch/{cibillId}")
	public Cibill m2(@PathVariable("cibillId") Integer cibillId) {
		Cibill c=hs.getData(cibillId);
		return c;
	}
}
