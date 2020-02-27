package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.Cibil;

@Repository
public interface CibilRepository extends CrudRepository<Cibil, Integer>{

}
