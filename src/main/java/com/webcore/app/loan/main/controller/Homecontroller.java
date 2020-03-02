package com.webcore.app.loan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.webcore.app.loan.main.model.Tenure;
import com.webcore.app.loan.main.service.HomeService;
@RestController
public class Homecontroller 
{
  @Autowired
  HomeService hs;
  @RequestMapping("/reg")
  private String savedata(@RequestBody Tenure tr)
  {
	  hs.saveData(tr);
	  return "save successfully";
  }
 
}
