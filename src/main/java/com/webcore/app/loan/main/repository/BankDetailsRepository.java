package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.BankDetails;

@Repository
public interface BankDetailsRepository extends CrudRepository<BankDetails, Integer>{

}
