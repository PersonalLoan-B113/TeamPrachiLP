package com.webcore.app.loan.main.repositri;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.Cibill;
@Repository
public interface HomeRepositri extends CrudRepository<Cibill, Integer>{

	Cibill findByCibillId(int cibillId);


}
