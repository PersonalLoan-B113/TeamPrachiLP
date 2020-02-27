package com.webcore.app.loan.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcore.app.loan.main.model.PreviousLoanDetails;

@Repository
public interface PreviousLoanDetailsRepository extends CrudRepository<PreviousLoanDetails, Integer>{

}
