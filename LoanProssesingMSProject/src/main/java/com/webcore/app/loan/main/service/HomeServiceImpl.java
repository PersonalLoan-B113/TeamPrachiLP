package com.webcore.app.loan.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.Cibill;
import com.webcore.app.loan.main.repositri.HomeRepositri;
import com.webcore.app.loan.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepositri hr;
	@Override
	public void saveData(Cibill c) {
		hr.save(c);
		
	}
	@Override
	public Cibill getData(int cibillId) {
		return hr.findByCibillId(cibillId);	
	}

}
