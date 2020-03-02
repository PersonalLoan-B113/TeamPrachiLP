package com.webcore.app.loan.main.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.Tenure;
import com.webcore.app.loan.main.repository.MyRepo;

@Service
public class HomeServiceimpl implements HomeService
{

	@Autowired
	MyRepo mr;

	@Override
	public void saveData(Tenure tr) {
	mr.save(tr);
		
	}
	
}
	
	


