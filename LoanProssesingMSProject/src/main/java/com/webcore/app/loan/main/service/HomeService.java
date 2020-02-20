package com.webcore.app.loan.main.service;

import com.webcore.app.loan.main.model.Cibill;

public interface HomeService  {

	void saveData(Cibill c);

	Cibill getData(int cibillId);

}
